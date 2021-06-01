package com.ejkang.designpattern.bridge.abstractExtends;

import com.ejkang.designpattern.bridge.interfaceImple.HelloInterface;

public class Message extends LanguageAbstr {

    public Message(HelloInterface lan) {
        this.lan = lan;
    }

    @Override
    public String greeting() {
        // bridge part
        return this.lan.greeting();
    }

}
