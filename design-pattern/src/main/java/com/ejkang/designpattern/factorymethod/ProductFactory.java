package com.ejkang.designpattern.factorymethod;

public class ProductFactory extends Factory {

	@Override
	protected Product createProduct() {
		return new LGProduct();
	}
}
