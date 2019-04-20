package com.xywei.interrupted;

public class MyThread extends Thread {

	int i = 0;

	public MyThread(String name, int i) {
		this.i = i;
		super.setName(name);
	}

	@Override
	public void run() {

		for (int j = 0; j <= i; j++) {
			System.out.println("j==" + j);
		}

	}

}
