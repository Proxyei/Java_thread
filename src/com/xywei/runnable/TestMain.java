package com.xywei.runnable;

public class TestMain {

	public static void main(String[] args) {
		GetMoney target = new GetMoney();

		Thread thread1 = new Thread(target);
		Thread thread2 = new Thread(target);
		Thread thread3 = new Thread(target);
		Thread thread4 = new Thread(target);
		Thread thread5 = new Thread(target);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}
}
