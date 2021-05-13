package com.ejkang.designpattern.abstractfactory;

import com.ejkang.designpattern.abstractfactory.template.DoorProduct;
import com.ejkang.designpattern.abstractfactory.template.Factory;
import com.ejkang.designpattern.abstractfactory.template.TireProduct;

public class KoreaFactory extends Factory{

	@Override
	public TireProduct createTire() {
		return new KoreaTireProduct();
	}

	@Override
	public DoorProduct createDoor() {
		return new KoreaDoorProduct();
	}

}
