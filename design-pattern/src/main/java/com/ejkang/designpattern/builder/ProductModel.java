package com.ejkang.designpattern.builder;

public class ProductModel extends Algorism{

	public ProductModel() {
		computer = new Computer();
	}
	
	@Override
	public void setRam(int[] size) {
		for (int i :size) {
			computer.ram.add(new Memory(i));
		}
	}

	@Override
	public void setStorage(int[] size) {
		for (int i :size) {
			computer.storage.add(new Storage(i));
		}
	}

}
