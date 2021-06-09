package com.ejkang.designpattern.decorator;

public class CpuI7 extends Decorate {

    public Component base;

    CpuI7(Component concrete) {
        this.base = concrete;
    }

    @Override
    public String product() {
        return base.product() + ", i7";
    }

    @Override
    public int price() {
        return base.price() + 475000;
    }

}
