package com.ejkang.designpattern.bridge;

import com.ejkang.designpattern.bridge.abstractExtends.LanguageAbstr;
import com.ejkang.designpattern.bridge.abstractExtends.Message;
import com.ejkang.designpattern.bridge.interfaceImple.English;
import com.ejkang.designpattern.bridge.interfaceImple.HelloInterface;
import com.ejkang.designpattern.bridge.interfaceImple.Korean;
import com.ejkang.designpattern.bridge.interfaceImple.Language;

public class Main {

	public static void main(String[] args) {
		Hello hello = new Hello();
		System.out.println(hello.greeting());

		System.out.println("change of code - add param");
		System.out.println(hello.greeting("Korean"));
		System.out.println(hello.greeting("English"));

		Greeting greet = new Greeting();
		System.out.println("extend");
		System.out.println(greet.ko());

		System.out.println("Interface And Implements");
		HelloInterface ko = new Korean();
		HelloInterface en = new English();
		System.out.println(ko.greeting());
		System.out.println(en.greeting());

		System.out.println("Composite of Interface Imple");
		Language lan = new Language();
		lan.setEnglish(new English());
		lan.setKorean(new Korean());
		System.out.println(lan.en.greeting());
		System.out.println(lan.ko.greeting());

		System.out.println("Bridge Pattern");
		LanguageAbstr lanAb = new Message(new English());
		System.out.println(lanAb.greeting());

		lanAb = new Message(new Korean());
		System.out.println(lanAb.greeting());
	}
}
