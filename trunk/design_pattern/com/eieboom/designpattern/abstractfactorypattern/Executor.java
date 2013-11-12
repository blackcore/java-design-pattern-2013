/**
 * 
 */
package eieboom.designpattern.abstractfactorypattern;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class Executor {
	public void Execute() {
		// 第一条生产线，男性生产线
		IHumanFactory maleHumanFactory = new HumanMaleFactory();
		// 第二条生产线，女性生产线
		IHumanFactory femaleHumanFactory = new HumanFemaleFactory();

		// 生产线建立完毕，开始生产人了:
		IHuman maleYellowHuman = maleHumanFactory.CreateYellowHuman();
		IHuman femaleYellowHuman = femaleHumanFactory.CreateYellowHuman();
		maleYellowHuman.Cry();
		maleYellowHuman.Laugh();
		maleYellowHuman.Talk();
		maleYellowHuman.Gender();
		
		femaleYellowHuman.Cry();
		femaleYellowHuman.Laugh();
		femaleYellowHuman.Talk();
		femaleYellowHuman.Gender();
	}
}
