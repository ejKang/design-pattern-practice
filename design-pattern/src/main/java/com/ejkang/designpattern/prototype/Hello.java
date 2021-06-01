package com.ejkang.designpattern.prototype;

import java.util.List;

public class Hello implements Cloneable {

	private String message;
	private List<String> list;

	public Hello(String msg) {
		message = msg;
	}

	public Hello(List<String> list) {
		this.list = list;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// @Override
	// protected Object clone() throws CloneNotSupportedException {
	// List<String> temp = new ArrayList<>();
	// for (String str : list) {
	// temp.add(str);
	// }

	// return new Hello(temp);
	// }

	// @Override
	// protected Hello clone() throws CloneNotSupportedException {

	// return new Hello(this.message);
	// }

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
