package com.ejkang.designpattern.factory;

public class Hello {
	public String greeting() {
		// return "안뇽!";
		// Korean ko = new Korean();
		// return ko.text();

		Language language = Factory.getInstance("ko");
		return language.text();
	}
}
