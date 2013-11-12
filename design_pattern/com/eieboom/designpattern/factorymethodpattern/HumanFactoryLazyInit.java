/**
 * 
 */
package eieboom.designpattern.factorymethodpattern;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import eieboom.assistant.ClassHelper;

/**
 * 延迟加载
 * 
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class HumanFactoryLazyInit {

	/**
	 * 加载过的对象都存储在map中，供下次使用
	 */
	private static HashMap<String, IHuman> humans = new HashMap<String, IHuman>();

	/**
	 * 指定人类肤色
	 * 
	 * @param cls
	 * @return
	 */
	public static IHuman CreateHuman(Class<?> cls) {
		IHuman human = null; // 定义一个类型的人类
		try {
			// 如果map中有，则直接从取出，不用初始化了
			if (humans.containsKey(cls.getSimpleName())) {
				human = humans.get(cls.getSimpleName());
			} else {
				human = (IHuman) Class.forName(cls.getName()).newInstance();
				// 存入map
				humans.put(cls.getSimpleName(), human);
			}
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
