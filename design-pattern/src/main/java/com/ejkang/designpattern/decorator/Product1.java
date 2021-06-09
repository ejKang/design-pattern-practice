package com.ejkang.designpattern.decorator;

public class Product1 implements Component {

    @Override
    public String product() {

        return "one pice";
    }

    @Override
    public int price() {
        return 20000;
    }

}
