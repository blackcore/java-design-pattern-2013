/**
 * 
 */
package eieboom.designpattern.strategypattern;

/**
 * 策略：求吴国开绿灯
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ImplGivenGreenLight implements IStrategy {

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.strategypattern.IStrategy#Run()
	 */
	@Override
	public void Run() {
		System.out.println("开绿灯：找吴国开绿灯放行！");
	}
}
