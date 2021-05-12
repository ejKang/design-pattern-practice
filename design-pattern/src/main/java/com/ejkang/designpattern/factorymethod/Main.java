package com.ejkang.designpattern.factorymethod;

public class Main {
	public static void main(String[] args) {
		Factory factory = new ProductFactory();
		Product product = factory.create();
		product.name();
	}
}
