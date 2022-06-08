package com.dp.factory.method;

import com.dp.factory.Pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {

		Pizza pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract public Pizza createPizza(String type);
}
