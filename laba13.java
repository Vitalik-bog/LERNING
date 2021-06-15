package com.company;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        DeliveryFactory myThuckcarFactory = new ThuckcarDeliveryFactory(); // 1 грузоперевозка
        DeliveryFactory myShipFactory = new ShipDeliveryFactory();// 2 перевозка
        DeliveryFactory myAirFactory = new AirDeliveryFactory();



        Delivery myThuckcarDelivery = myThuckcarFactory.createDelivery();//создание т.с
        Delivery myShipDelivery = myShipFactory.createDelivery();//создание т.с
        Delivery myAirDelivery = myAirFactory.createDelivery();//создание т.с
        System.out.println(myThuckcarDelivery);
        System.out.println(myShipDelivery);
        System.out.println(myAirDelivery);
    }
}

abstract class Delivery {// класс перевозки выдает вид перевозки + аксессуары
    String name;

    List<String> accessories = new ArrayList();

    public String toString() {
        return "Model Delivery: " + name + "\n" + accessories;
    }
}

abstract class DeliveryFactory { //абстрактный класс доставки__создает доставку__
    public abstract Delivery createDelivery();// создание доставки

}

class ThuckcarDeliveryFactory extends DeliveryFactory {// подкласс грузоперевозки принадлежит классу доставки

    public Delivery createDelivery() {//создание класса доставки
        return new ThuckcarDelivery();// возвращает
    }

}

class ShipDeliveryFactory extends DeliveryFactory {//подкласс корабли принадлежит доставке

    public Delivery createDelivery() {// создание объекта класса

        return new ShipDelivery();// возврат корабля
    }

}

class AirDeliveryFactory extends DeliveryFactory {//подкласс самолеты принадлежит доставке

    public Delivery createDelivery() {//создание обьекта класса
        return new AirDelivery();//возврат самолета
    }
}

class ThuckcarDelivery extends Delivery {//класс

    public ThuckcarDelivery() {//описание класса
        name = "Thuck Car";//имя
        accessories.add("права категории С");//аксусуар 1
        accessories.add("мед. книжка");// аксуар 2
        accessories.add("накладная на товары");//аксуссуар 3
        accessories.add("документы на транспорт");//аксуссуар 4
    }
}

class ShipDelivery extends Delivery {
    public ShipDelivery() {
        name = "Корабль";
        accessories.add("документы на судно");
        accessories.add("Водные права");
    }
}

class AirDelivery extends Delivery {
    public AirDelivery() {
        name = "Самолет";
        accessories.add("документы на самолет");
        accessories.add("Самолетные права");
        accessories.add("Медицинская книжка");
        accessories.add("Разрешение трезвости");
        accessories.add("Тех.инструктаж");
    }
}
