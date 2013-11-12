/**
 * 
 */
package eieboom.designpattern.strategypattern;

/**
 * 使用策略
 * 
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class Executor {

	/**
	 * 执行策略
	 */
	public void Execute() {
		BrocadeBag bag;

		// 刚刚到吴国的时候拆第一个
		System.out.println("-----------刚刚到吴国的时候拆第一个-------------");
		bag = new BrocadeBag(new eieboom.designpattern.strategypattern.ImplBackDoor());
		bag.Run();
		System.out.println(System.getProperty("line.separator"));

		// 刘备乐不思蜀了，拆第二个了
		System.out.println("-----------刘备乐不思蜀了，拆第二个了-------------");
		bag = new BrocadeBag(new eieboom.designpattern.strategypattern.ImplGivenGreenLight());
		bag.Run();
		System.out.println(System.getProperty("line.separator"));

		// 孙权的小兵追了，咋办？拆第三个
		System.out.println("-----------孙权的小兵追了，咋办？拆第三个-------------");
		bag = new BrocadeBag(new eieboom.designpattern.strategypattern.ImplBlockEnemy());
		bag.Run();
		System.out.println(System.getProperty("line.separator"));
	}
}
