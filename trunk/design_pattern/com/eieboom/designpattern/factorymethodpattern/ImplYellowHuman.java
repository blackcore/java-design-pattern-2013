/**
 * 
 */
package eieboom.designpattern.factorymethodpattern;

/**
 * 黄色人种
 * 
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ImplYellowHuman implements IHuman {

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.factorymethodpattern.IHuman#Langu()
	 */
	@Override
	public void Laugh() {
		// System.out.println(this.getClass().getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.factorymethodpattern.IHuman#Cry()
	 */
	@Override
	public void Cry() {
		// System.out.println(this.getClass().getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.factorymethodpattern.IHuman#Talk()
	 */
	@Override
	public void Talk() {
		// System.out.println(this.getClass().getName());
	}

}
