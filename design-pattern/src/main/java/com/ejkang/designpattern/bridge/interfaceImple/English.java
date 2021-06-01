package com.ejkang.designpattern.bridge.interfaceImple;

public class English implements HelloInterface {

    @Override
    public String greeting() {
        return "Hello";
    }

}
