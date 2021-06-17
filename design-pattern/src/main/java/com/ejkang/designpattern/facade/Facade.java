package com.ejkang.designpattern.facade;

public class Facade {

    private Package1 p1;
    private Package2 p2;
    private Package3 p3;

    Facade() {
        p1 = new Package1();
        p2 = new Package2();
        p3 = new Package3();
    }

    public void processFacade() {
        p1.process();
        p2.process();
        p3.process();
    }
}
