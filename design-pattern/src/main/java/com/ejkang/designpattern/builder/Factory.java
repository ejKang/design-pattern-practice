package com.ejkang.designpattern.builder;

public class Factory extends Builder{

	public Factory(Algorism algorism) {
		super(algorism);
	}

	@Override
	public Builder build() {
		int[] aa = {1, 2,};
		algorism.setRam(aa);
		algorism.setStorage(aa);
		return this;
	}

}
