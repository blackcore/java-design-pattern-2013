/**
 * 
 */
package eieboom.designpattern.abstractfactorypattern;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public interface IHumanFactory {
	public IHuman CreateYellowHuman();

	public IHuman CreateBlackHuman();

	public IHuman CreateWhiteHuman();	
}
