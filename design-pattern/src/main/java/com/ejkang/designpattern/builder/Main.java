package com.ejkang.designpattern.builder;

public class Main {
	public static void main(String[] args) {
		
		Algorism algorism = new ProductModel();
		
		
		Builder factory = new Factory(algorism);
		
		Computer computer = factory.build().getInstance();
		computer.toString();
	}
}
