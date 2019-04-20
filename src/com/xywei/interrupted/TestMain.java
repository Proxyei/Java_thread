package com.xywei.interrupted;

public class TestMain {

	public static void main(String[] args) {

		/**
		 * 测试线程是否能被中断，结果是interrupted()使用后也无法中断线程
		 * 
		 */
		MyThread myThread = new MyThread("线程1", 50000);

		myThread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		myThread.interrupt();

	}
}
