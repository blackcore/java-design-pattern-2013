/**
 * 
 */
package eieboom.designpattern.abstractfactorypattern;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public abstract class AbstractHumanFactory implements IHumanFactory {
	/*
	 * 给定一个性别人类，创建一个人类出来专业术语是产生产品等级
	 */
	protected IHuman createHuman(HumanEnum humanEnum) {
		IHuman human = null;
		// 如果传递进来不是一个Enum中具体的一个Element的话，则不处理
		if (!humanEnum.getValue().equals("")) {
			try {
				// 直接产生一个实例
				human = (IHuman) Class.forName(humanEnum.getValue()).newInstance();
			} catch (Exception e) {
				// 因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题；
				System.out.println(e);
			}
		}
		return human;
	}

}
