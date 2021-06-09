package com.ejkang.designpattern.decorator;

public class Ssd256 extends Decorate {

    public Component base;

    Ssd256(Component concrete) {
        this.base = concrete;
    }

    @Override
    public String product() {
        return base.product() + ", ssd256";
    }

    @Override
    public int price() {
        return base.price() + 11000;
    }

}
