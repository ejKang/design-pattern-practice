package com.dp.factory.method;

import com.dp.factory.Pizza;

public class NYStyleCheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepareing NY-Style Cheese Pizza ~ ");
	}

	@Override
	public void bake() {
		System.out.println("Baking NY-Style Cheese Pizza ~ ");
		
	}

	@Override
	public void cut() {
		System.out.println("Cuting NY-Style Cheese Pizza ~ ");
		
	}

	@Override
	public void box() {
		System.out.println("Boxing NY-Style Cheese Pizza ~ ");
		
	}

}
