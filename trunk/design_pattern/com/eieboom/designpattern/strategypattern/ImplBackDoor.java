/**
 * 
 */
package eieboom.designpattern.strategypattern;

/**
 * 策略：走后门
 * 
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ImplBackDoor implements IStrategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.strategypattern.IStrategy#Run()
	 */
	@Override
	public void Run() {
		System.out.println("走后门，找乔国老帮忙，让吴国太给孙权施加压力！");
	}

}
