package com.ejkang.designpattern.abstractfactory;

import com.ejkang.designpattern.abstractfactory.template.DoorProduct;
import com.ejkang.designpattern.abstractfactory.template.Factory;
import com.ejkang.designpattern.abstractfactory.template.TireProduct;

public class Main {
	public static void main(String[] args) {
		Factory factory = new KoreaFactory();
		TireProduct tire = factory.createTire();
		DoorProduct door = factory.createDoor();
		
		System.out.println(tire.makeAssemble());
		System.out.println(door.makeAssemble());
		
		factory = new StateFactory();
		tire = factory.createTire();
		door = factory.createDoor();
		
		System.out.println(tire.makeAssemble());
		System.out.println(door.makeAssemble());
		
	}
}
