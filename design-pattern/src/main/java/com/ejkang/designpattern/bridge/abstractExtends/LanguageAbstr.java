package com.ejkang.designpattern.bridge.abstractExtends;

import com.ejkang.designpattern.bridge.interfaceImple.HelloInterface;

public abstract class LanguageAbstr {
    public HelloInterface lan;

    abstract public String greeting();
}
