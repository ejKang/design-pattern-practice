package com.ejkang.designpattern.abstractfactory;

import com.ejkang.designpattern.abstractfactory.template.DoorProduct;

public class KoreaDoorProduct extends DoorProduct{

	@Override
	public String makeAssemble() {
		return "korea door product";
	}

}
