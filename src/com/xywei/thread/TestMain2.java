package com.xywei.thread;

public class TestMain2 {

	public static void main(String[] args) {

		Thread thread1 = new GetMoney2();
		Thread thread2 = new GetMoney2();
		thread1.start();
		thread2.start();

	}
}
