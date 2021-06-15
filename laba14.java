package com.company;

class Naruto {
    private static Naruto Animepers = new Naruto();
    private int force;

    private Naruto() {
        this.force = 12;
    }

    public static Naruto getInstance() {
        return Animepers;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}

public class Main {
    public static void main(String[] args) {
        Naruto amhero = Naruto.getInstance();
        System.out.println(amhero.getForce());
        amhero.setForce(50);
        Naruto dtHero1 = Naruto.getInstance();
        System.out.println((dtHero1.getForce()));
        if (dtHero1.hashCode() == amhero.hashCode()) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }
    } {
    }
