package com.xywei.thread;

public class TestMain {

	public static void main(String[] args) {

		Thread thread1 = new GetMoney();
		Thread thread2 = new GetMoney();
		thread1.start();
		thread2.start();

	}
}
