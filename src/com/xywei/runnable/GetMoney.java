package com.xywei.runnable;

public class GetMoney implements Runnable {

	private int num = 1000;

	@Override
	public void run() {

		while (true) {
			synchronized ("lock") {

				if (num > 0) {
					num -= 1;
					System.out.println(Thread.currentThread().getName() + " 取走了 1，余额 " + num);
				} else {
					break;
				}
			}
		}
	}

}
