/**
 * 
 */
package eieboom.designpattern.factorymethodpattern;

import eieboom.designpattern.factorymethodpattern.*;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class Executor {
	public void ExecuteTarget() {
		// 女娲第一次造人，试验性质，少造点，火候不足，缺陷产品
		System.out.println("------------造出的第一批人是这样的：白人-----------------");
		IHuman whiteHuman = HumanFactory.CreateHuman(ImplWhiteHuman.class);
		whiteHuman.Cry();
		whiteHuman.Laugh();
		whiteHuman.Talk();
		// 女娲第二次造人，火候加足点，然后又出了个次品，黑人
		System.out.println("\n\n------------造出的第二批人是这样的：黑人-----------------");
		IHuman blackHuman = HumanFactory.CreateHuman(ImplBlackHuman.class);
		blackHuman.Cry();
		blackHuman.Laugh();
		blackHuman.Talk();
		// 第三批人了，这次火候掌握的正好，黄色人类（不写黄人，免得引起歧义），备注：RB人不属于此列
		System.out.println("\n\n------------造出的第三批人是这样的：黄色人类-----------------");
		IHuman yellowHuman = HumanFactory.CreateHuman(ImplYellowHuman.class);
		yellowHuman.Cry();
		yellowHuman.Laugh();
		yellowHuman.Talk();
	}

	/**
	 * 随机生成
	 */
	public void ExecuteRandom(int humanTotal) {

		System.out.println("随机生成：" + humanTotal + "人！");
		for (int i = 0; i < humanTotal; i++) {
			IHuman human = HumanFactory.CreateHuman();
			human.Cry();
			human.Laugh();
			human.Talk();
		}
		System.out.println(System.getProperty("line.separator"));
	}

	/**
	 * 随机生成
	 */
	public void ExecuteRandomByLazyInit(int humanTotal) {

		System.out.println("延迟加载随机生成：" + humanTotal + "人！");
		for (int i = 0; i < humanTotal; i++) {
			IHuman human = HumanFactoryLazyInit.CreateHuman();
			human.Cry();
			human.Laugh();
			human.Talk();
		}
		System.out.println(System.getProperty("line.separator"));
	}

}
