/**
 * 
 */
package eieboom.designpattern.proxypattern;

/**
 * SS也如同PJL一类人
 * 
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ImplSS implements IWallOfFemale {

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.proxypattern.IWallOfFemale#throwEyes()
	 */
	@Override
	public void throwEyes() {
		System.out.println("SS 抛媚眼出大招！");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.proxypattern.IWallOfFemale#seekStimulus()
	 */
	@Override
	public void seekStimulus() {
		System.out.println("SS 寻求刺激中......");
	}

}
