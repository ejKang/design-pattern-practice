package com.ejkang.designpattern.factorymethod;

public class LGProduct implements Product{

	@Override
	public void name() {
		System.out.println("역시 가전은 LG");
	}

}
