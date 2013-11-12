/**
 * 
 */
package eieboom.designpattern.strategypattern;

/**
 * 策略：断追兵
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ImplBlockEnemy implements IStrategy {

	/* (non-Javadoc)
	 * @see eieboom.designpattern.strategypattern.IStrategy#Run()
	 */
	@Override
	public void Run() {
		System.out.println("断追兵：求孙夫人帮忙阻击！");
	}

}
