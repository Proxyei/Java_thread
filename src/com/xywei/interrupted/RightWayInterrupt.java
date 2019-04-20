package com.xywei.interrupted;

public class RightWayInterrupt extends Thread {

	@Override
	public void run() {

		try {
			for (int i = 0; i < 500000; i++) {
				// 当前线程
				if (Thread.interrupted()) {
					System.out.println(Thread.currentThread().getName() + "使用了this.interrupted，要撤了!i=" + i);
					throw new InterruptedException();
				}
				System.out.println("i=" + i);

			}

		} catch (InterruptedException e) {
			System.out.println("我要退出了！");
		}

	}
}
