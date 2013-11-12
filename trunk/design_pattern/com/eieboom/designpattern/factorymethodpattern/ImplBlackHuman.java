/**
 * 
 */
package eieboom.designpattern.factorymethodpattern;

/**
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ImplBlackHuman implements IHuman {

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.factorymethodpattern.IHuman#Langu()
	 */
	@Override
	public void Laugh() {
		//System.out.println(this.getClass().getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.factorymethodpattern.IHuman#Cry()
	 */
	@Override
	public void Cry() {
		//System.out.println(this.getClass().getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.factorymethodpattern.IHuman#Talk()
	 */
	@Override
	public void Talk() {
		//System.out.println(this.getClass().getName());
	}

}
