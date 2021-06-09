package com.ejkang.designpattern.decorator;

public abstract class Decorate implements Component {
    abstract public String product();

    abstract public int price();
}
