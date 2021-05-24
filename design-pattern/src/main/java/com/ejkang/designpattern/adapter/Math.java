package com.ejkang.designpattern.adapter;

public class Math {

	public float twoTime(float num) {
		
		return num * 2;
	}
	
	public float halfTime(float num) {
		
		return num / 2;
	}
	
	public static void main(String[] args) {
		Math math = new Math();
		float rst = math.twoTime(2.1f);
		float rst1 = math.twoTime(2.2f);
		System.out.println(rst);
		System.out.println(rst1);
		
		Objects obj = new Objects();
		System.out.println(obj.twiceOf(33));
		System.out.println(obj.halfOf(33));
		
	}
}
