package com.ejkang.designpattern.singleton;

public class Config {
	
	private static Config instance = null;
	
	private Config() {
		// private constructor
	}
	
	public static Config getInstance() {
		if (instance == null) {
			instance = new Config();
		}
		return instance;
	}
}
