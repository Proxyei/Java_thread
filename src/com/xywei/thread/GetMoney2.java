package com.xywei.thread;

/**
 * 推荐使用同步代码块
 * 
 */
public class GetMoney2 extends Thread {

	// 必须加static，应该数据要共享
	private static int num = 10000;

	// 使用同步方法不能直接加synchronized
	@Override
	public void run() {
		while (true) {
			int count = dropMoney();
			if (count == 0) {
				break;
			}
		}
	}

	private static synchronized int dropMoney() {

		// 必须是贡献的监视器

		if (num > 0) {

			num -= 1000;
			System.out.println(Thread.currentThread().getName() + " 取走了：" + 1000 + "，余额为：" + num);
		}
		return num;

	}

}
