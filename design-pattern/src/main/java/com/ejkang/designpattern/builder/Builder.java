package com.ejkang.designpattern.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Builder {

	protected Algorism algorism;
	
	public Builder setAlgorism(Algorism algorism) {
		this.algorism = algorism;
		
		return this;
	}
	
	public Computer getInstance() {
		return algorism.getInstance();
	}
	
	abstract public Builder build(); // 복합 객체 생성 
}
