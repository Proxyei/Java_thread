package com.xywei.thread;

public class MyThread extends Thread {

	private int count = 5;

	// 这种方法是有缺陷的
	@Override
	synchronized public void run() {
		count--;
		System.out.println(Thread.currentThread().getName() + "使用了后结果为：" + count);
	}
}
