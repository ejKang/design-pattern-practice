package com.ejkang.designpattern.bridge.interfaceImple;

public class Language {
    public HelloInterface ko;
    public HelloInterface en;

    public void setEnglish(HelloInterface en) {
        this.en = en;
    }

    public void setKorean(HelloInterface ko) {
        this.ko = ko;
    }
}
