/**
 * 
 */
package eieboom.designpattern.factorymethodpattern;

import java.util.List;
import java.util.Random;

import eieboom.assistant.ClassHelper;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class HumanFactory {
	/**
	 * 指定人类肤色
	 * 
	 * @param cls
	 * @return
	 */
	public static IHuman CreateHuman(Class<?> cls) {
		IHuman human = null; // 定义一个类型的人类
		try {
			human = (IHuman) Class.forName(cls.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return human;
	}

	/**
	 * 随机肤色
	 * 
	 * @return
	 */
	public static IHuman CreateHuman() {
		IHuman human = null; // 定义一个类型的人类

		// 定义了多少种人类
		List<Class> concreteHumanList = ClassHelper.getAllClassByInterface(IHuman.class);
		// 随机生成人类
		Random random = new Random();
		int rand = random.nextInt(concreteHumanList.size());
		human = CreateHuman(concreteHumanList.get(rand));
		return human;

	}
}
