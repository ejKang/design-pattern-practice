package com.ejkang.designpattern.builder;

public abstract class Algorism {

	
	protected Computer computer;
	
//	abstract public void setCpu()
	abstract public void setRam(int[] size);
	abstract public void setStorage(int[] size);
	
	
	public Computer getInstance() {
		return this.computer;
	}
}
