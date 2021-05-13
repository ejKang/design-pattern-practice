package com.ejkang.designpattern.abstractfactory;

import com.ejkang.designpattern.abstractfactory.template.DoorProduct;

public class StateDoorProduct extends DoorProduct{

	@Override
	public String makeAssemble() {
		return "state door product";
	}

}
