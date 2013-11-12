/**
 * 
 */
package eieboom.designpattern.abstractfactorypattern;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ImplAbstractYellowHuman implements IHuman {

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.abstractfactorypattern.IHuman#Laugh()
	 */
	@Override
	public void Laugh() {
		System.out.println("Laugh");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.abstractfactorypattern.IHuman#Cry()
	 */
	@Override
	public void Cry() {
		System.out.println("Cry");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.abstractfactorypattern.IHuman#Talk()
	 */
	@Override
	public void Talk() {
		System.out.println("Talk");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.abstractfactorypattern.IHuman#Gender()
	 */
	@Override
	public void Gender() {
		System.out.println("Gender");
	}

}
