package com.ejkang.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> name = new ArrayList<>();
		name.add("Kim");
		name.add("Lee");
		name.add("Kang");
		
		Hello hello = new Hello(name);
		System.out.println(hello.getList().toString());
		
		Hello copyed = (Hello)hello.clone();
		copyed.getList().add("Jang");
		System.out.println(copyed.getList().toString());
	}
}
