package com.ejkang.designpattern.abstractfactory.template;

public abstract class Factory {
	
	abstract public TireProduct createTire();
	abstract public DoorProduct createDoor();
}
