package com.xywei.interrupted;

public class RightWayInterruptTest {

	public static void main(String[] args) {
		RightWayInterrupt myThread = new RightWayInterrupt();
		myThread.start();
		try {
			// 保证主线程醒过来的时候，子线程未结束任务
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("主线程睡眠中断异常");
		}
		myThread.interrupt();
		System.out.println("===end===");
	}
}
