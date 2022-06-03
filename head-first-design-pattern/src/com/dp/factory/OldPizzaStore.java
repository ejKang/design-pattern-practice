package com.dp.factory;

public class OldPizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		if (type.equals("Cheese")) {
			pizza = new CheesePizza();
		} else {
			pizza = new CheesePizza();
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
