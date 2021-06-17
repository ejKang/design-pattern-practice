package com.ejkang.designpattern.facade;

public class Main {

    public static void main(String[] args) {
        Package1 p1 = new Package1();
        Package2 p2 = new Package2();
        Package3 p3 = new Package3();

        p1.process();
        p2.process();
        p3.process();

        System.out.println(" Facade Pattern");

        Facade facade = new Facade();
        facade.processFacade();

    }
}
