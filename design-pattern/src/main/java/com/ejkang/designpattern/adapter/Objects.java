package com.ejkang.designpattern.adapter;

public class Objects implements Adapter{

	private Math adapter;
	
	public Objects() {
		this.adapter = new Math();
	}
	@Override
	public int twiceOf(int num) {
		int rst = (int) this.adapter.twoTime(num);
		return rst;
	}

	@Override
	public int halfOf(int num) {
		int rst = (int) this.adapter.halfTime(num);
		return rst;
	}

}
