/**
 * 
 */
package eieboom.designpattern.sample;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class testDesignPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		testStrategyPattern();
	}

	/**
	 * 测试策略模式
	 */
	static void testStrategyPattern() {
		eieboom.designpattern.strategypattern.Executor executor = new eieboom.designpattern.strategypattern.Executor();
		executor.Execute();
	}

}
