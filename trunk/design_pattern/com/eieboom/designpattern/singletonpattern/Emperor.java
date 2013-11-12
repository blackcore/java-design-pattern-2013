/**
 * 
 */
package eieboom.designpattern.singletonpattern;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class Emperor {

	/**
	 * 直接new一个对象传递给类的成员变量emperor，你要的时候getInstance()直接返回
	 */
	private static final Emperor emperor = new Emperor();

	/**
	 * 不能实例
	 */
	private Emperor() {
	}

	public synchronized static Emperor getInstance() {
		return emperor;
	}

	private static Long COUNTER = 0L;

	public void addCounter(Long value) {
		Emperor.COUNTER = Emperor.COUNTER + value;
	}

	public Long getCounter() {
		return Emperor.COUNTER;
	}

}
