package com.ejkang.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
	public List<Memory> ram = new ArrayList<>();
	public List<Storage> storage= new ArrayList<>();
	
	@Override
	public String toString() {
		
		storage.stream().forEach((o) -> {
			System.out.println("storage: " + o.getSize());
		});
		
		ram.stream().forEach((o) -> {
			System.out.println("ram: " + o.getSize());
		});
		
		return super.toString();
	}
}
