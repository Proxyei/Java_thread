package com.xywei.thread;

/**
 * 推荐使用同步代码块
 * 
 */
public class GetMoney extends Thread {

	// 必须加static，应该数据要共享
	private static int num = 10000;
	private int money = 1000;

	@Override
	public void run() {
		while (true) {
			// 必须是贡献的监视器
			synchronized ("lock") {
				if (num > 0) {
					num -= money;
					System.out.println(Thread.currentThread().getName() + " 取走了：" + money + "，余额为：" + num);
				} else {
					break;
				}

			}
		}

	}

}
