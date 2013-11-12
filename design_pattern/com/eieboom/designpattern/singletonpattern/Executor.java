/**
 * 
 */
package eieboom.designpattern.singletonpattern;

import java.util.Random;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class Executor {
	public void execute() {
		for (int i = 1; i <= 100; i++) {
			// ThreadExecutor te = new ThreadExecutor(Long.parseLong(new Random().nextInt(i) + ""));
			ThreadExecutor te = new ThreadExecutor(Long.parseLong(i + ""));
			Thread t = new Thread(te);
			t.start();
		}
	}
}

class ThreadExecutor extends Thread {
	private Long value = 0L;

	public ThreadExecutor(Long value) {
		this.value = value;

	}

	public void run() {
		System.out.print(Thread.currentThread().getName() + ":\t" + Emperor.getInstance().getCounter() + "+" + this.value + "=");
		Emperor.getInstance().addCounter(this.value);
		System.out.println("\t" + Emperor.getInstance().getCounter());
	}
}
