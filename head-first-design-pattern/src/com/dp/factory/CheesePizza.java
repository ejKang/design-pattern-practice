package com.dp.factory;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepareing CheesePizza ~ ");
	}

	@Override
	public void bake() {
		System.out.println("Baking CheesePizza ~ ");
		
	}

	@Override
	public void cut() {
		System.out.println("Cuting CheesePizza ~ ");
		
	}

	@Override
	public void box() {
		System.out.println("Boxing CheesePizza ~ ");
		
	}

}
