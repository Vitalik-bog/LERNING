package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Mail m = new Mail();
        Client c = new Client(m);

        m.changeData("Журнал1", 48);
        m.changeData("Журнал2", 31);
        m.changeData("Журнал3", 17);
    }
}

interface Notifier {
    public void addObserver(Observer obs);

    public void removeObserver(Observer obs);

    public void notifyObserver();
}

class Mail implements Notifier {
    private List observers;
    private String magazine;
    private int number;

    public Mail() {
        observers = new ArrayList();
    }

    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    // уведомить слушателей
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer obs = (Observer) observers.get(i);
            obs.update(magazine, number);
        }
    }

    public void changeData(String magazine, int number) {
        this.magazine = magazine;
        this.number = number;
        notifyObserver();
    }

}

interface Observer {
    public void update(String magazine, int number);
}

class Client implements Observer {
    private Notifier notifier;
    private String magazine;
    private int number;

    public Client(Notifier notifier) {
        this.notifier = notifier;
        notifier.addObserver(this);
    }

    public void update(String magazine, int number) {
        this.magazine = magazine;
        this.number = number;
        show();
    }

    public void show() {
        System.out.println("Magazine " + magazine + " Number = " + number);
    }

}
