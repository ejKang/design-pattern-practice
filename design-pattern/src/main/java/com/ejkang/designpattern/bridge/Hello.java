package com.ejkang.designpattern.bridge;

public class Hello {

	public String greeting() {

		return "Hello";
	}

	public String greeting(String lan) { // 코드의 변질

		if (lan == "Korean") {
			return "안녕하세요";
		} else {
			return "Hello";
		}

		
	}
}
