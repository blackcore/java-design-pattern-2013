/**
 * 
 */
package eieboom.designpattern.proxypattern;

/**
 * PJL 是一个出墙类型的Female
 * 
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ImplPJL implements IWallOfFemale {

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.proxypattern.IWallOfFemale#throwEyes()
	 */
	@Override
	public void throwEyes() {
		System.out.println("PJL 抛媚眼！");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see eieboom.designpattern.proxypattern.IWallOfFemale#seekStimulus()
	 */
	@Override
	public void seekStimulus() {
		System.out.println("PJL 寻求刺激中......");
	}

}
