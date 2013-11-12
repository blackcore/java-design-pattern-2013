/**
 * 
 */
package eieboom.designpattern.sample;

import eieboom.designpattern.factorymethodpattern.*;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class testFactoryMethodPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Executor executor = new Executor();
		executor.ExecuteTarget();
		// 随机生成N人
		int n = 50000;

		// 延时加载生成N人
		long s1 = System.currentTimeMillis();
		executor.ExecuteRandomByLazyInit(n);
		System.out.println("ExecuteRandomByLazyInit===================" + (System.currentTimeMillis() - s1));
		//
		long s = System.currentTimeMillis();
		executor.ExecuteRandom(n);
		System.out.println("ExecuteRandom===================" + (System.currentTimeMillis() - s));
	}

}
