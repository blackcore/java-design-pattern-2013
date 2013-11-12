/**
 * 
 */
package eieboom.designpattern.abstractfactorypattern;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public enum HumanEnum {

	/**
	 * 黄男
	 */
	YellowMaleHuman("eieboom.designpattern.abstractfactorypattern.MaleYellowHuman"),
	/**
	 * 黄女
	 */
	YellowFemaleHuman("eieboom.designpattern.abstractfactorypattern.FemaleYellowHuman"),
	/**
	 * 黑男
	 */
	BlackMaleHuman("eieboom.designpattern.abstractfactorypattern.MaleBlackHuman"),
	/**
	 * 黑女
	 */
	BlackFemaleHuman("eieboom.designpattern.abstractfactorypattern.FemaleBlackHuman"),
	/**
	 * 白男
	 */
	WhiteMaleHuman("eieboom.designpattern.abstractfactorypattern.MaleWhiteHuman"),
	/**
	 * 白女
	 */
	WhiteFemaleHuman("eieboom.designpattern.abstractfactorypattern.FemaleWhiteHuman");

	private String value = "";

	/**
	 * 定义构造函数，目的是Data(value)类型的相匹配
	 * 
	 * @param value
	 */
	private HumanEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
