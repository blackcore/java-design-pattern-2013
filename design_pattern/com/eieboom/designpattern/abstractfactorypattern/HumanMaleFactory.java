/**
 * 
 */
package eieboom.designpattern.abstractfactorypattern;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class HumanMaleFactory extends AbstractHumanFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.abstractfactorypattern.IHumanFactory#CreateYellowHuman()
	 */
	@Override
	public IHuman CreateYellowHuman() {
		return super.createHuman(HumanEnum.YellowMaleHuman);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.abstractfactorypattern.IHumanFactory#CreateBlackHuman()
	 */
	@Override
	public IHuman CreateBlackHuman() {
		return super.createHuman(HumanEnum.BlackMaleHuman);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.abstractfactorypattern.IHumanFactory#CreateWhiteHuman()
	 */
	@Override
	public IHuman CreateWhiteHuman() {
		return super.createHuman(HumanEnum.WhiteMaleHuman);
	}

}
