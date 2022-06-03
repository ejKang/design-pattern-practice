package com.dp.factory;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza;
		
		if (type.equals("Cheese")) {
			pizza = new CheesePizza();
		} else {
			pizza = new CheesePizza();
		}
		
		return pizza;
	}
}
