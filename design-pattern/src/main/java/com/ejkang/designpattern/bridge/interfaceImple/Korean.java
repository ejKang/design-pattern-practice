package com.ejkang.designpattern.bridge.interfaceImple;

public class Korean implements HelloInterface {

    @Override
    public String greeting() {
        return "안녕하세요";
    }

}
