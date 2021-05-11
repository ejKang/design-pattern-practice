package com.ejkang.designpattern.factory;

public class Factory {
	public static Language getInstance(String type) {

		if (type.equals("ko")) {
			return new Korean();
		} else {
			return new English();
		}

	}
}
