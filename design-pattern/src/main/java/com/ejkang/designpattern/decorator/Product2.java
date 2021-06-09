package com.ejkang.designpattern.decorator;

public class Product2 implements Component {

    @Override
    public String product() {
        return "brause";
    }

    @Override
    public int price() {
        return 25000;
    }

}
