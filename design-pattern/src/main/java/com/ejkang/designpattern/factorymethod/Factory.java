package com.ejkang.designpattern.factorymethod;

public abstract class Factory {
	public Product create() {
		
		return createProduct();
	}

	protected abstract Product createProduct();
}
