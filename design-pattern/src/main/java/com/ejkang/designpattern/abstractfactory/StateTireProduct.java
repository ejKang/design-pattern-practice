package com.ejkang.designpattern.abstractfactory;

import com.ejkang.designpattern.abstractfactory.template.TireProduct;

public class StateTireProduct extends TireProduct{

	@Override
	public String makeAssemble() {
		return "state tire product";
	}

}
