package com.ejkang.designpattern.abstractfactory;

import com.ejkang.designpattern.abstractfactory.template.TireProduct;

public class KoreaTireProduct extends TireProduct{

	@Override
	public String makeAssemble() {
		return "korea tire product";
	}

}
