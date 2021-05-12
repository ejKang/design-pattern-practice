package com.ejkang.designpattern.singleton;

public class MultiThreadConfig {
	private MultiThreadConfig() {}
	
	private static class InnerClz {
		private static final MultiThreadConfig config = new MultiThreadConfig();
	}
	
	public static MultiThreadConfig getInstance() {
		return InnerClz.config;
	}
}
