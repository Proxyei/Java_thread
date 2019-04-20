package com.xywei.interrupted;

/**
 * 测试使用 this.interrupted()：测试当前线程是否已经中断 this.inInterrupted()：测试线程是否已经中断
 * 
 * @author wodoo
 *
 */
public class TestMain2 {

	public static void main(String[] args) {

		MyThread myThread = new MyThread("线程1", 100);
		myThread.start();
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		myThread.interrupt();

		// 因为使用interrupt()无法中断线程，所以，此时的结果是false
		System.out.println("myThread.interrupt()使用后结果1:" + myThread.interrupted());
		System.out.println("myThread.interrupt()使用后this.isInterrupted()结果1:" + myThread.isInterrupted());

		// 假如等待5秒，再使用this.interrupted()查看线程是否已经中断
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("子线程是否存活:" + myThread.isAlive());// false
		System.out.println("myThread.interrupt()使用后结果2:" + myThread.interrupted());// false
		System.out.println("myThread.interrupt()使用后this.isInterrupted()结果2:" + myThread.isInterrupted());

		// this. isInterrupted()是中断当前线程，this.interrupted()是中断线程对象.
	}
}
