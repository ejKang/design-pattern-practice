package com.dp.factory.method;

import com.dp.factory.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		if (type.equals("Cheese")) {
			return new NYStyleCheesePizza();
		} else {
			return null;
		}
	}

}
