/**
 * 
 */
package eieboom.designpattern.strategypattern;

/**
 * 策略包
 * 
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class BrocadeBag {
	private IStrategy straegy;

	/**
	 * 装载初始化策略
	 * 
	 * @param strategy
	 */
	public BrocadeBag(IStrategy strategy) {
		this.straegy = strategy;
	}

	/**
	 * 招行策略
	 */
	public void Run() {
		this.straegy.Run();
	}
}
