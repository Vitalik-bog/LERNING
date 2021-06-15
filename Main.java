package com.company;
public class Main {
    public static void main(String[] args) {
        Person TOM=new Person();
        TOM.fullname="Tom";
        Person BOB=new Person("BOB",18);
        TOM.move();
        TOM.talk();
        BOB.move();
        BOB.talk();
    }
}
class Person {
    String fullname;
    int age;
    Person()
    {
        this.fullname = fullname;
        this.age = age;
    }
    Person (String f,int a)
    {
        this.fullname="BOB";
        this.age=age;
    }
    void move()
    {
        System.out.println(this.fullname + " speaking");
    }
    void talk()
    {
        System.out.println(this.fullname+ " not speaking");
    }
}
