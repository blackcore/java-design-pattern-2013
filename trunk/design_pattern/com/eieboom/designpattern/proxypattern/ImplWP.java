/**
 * 
 */
package eieboom.designpattern.proxypattern;

/**
 * WP 也是出墙类型的Female，但太老所以用经验帮助PJL一类女性搭线
 * 
 * @see WP是PJL的代理
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class ImplWP implements IWallOfFemale {
	IWallOfFemale wallOfFemale;

	/**
	 * 默认WP是PJL的代理人
	 */
	public ImplWP() {
		this.wallOfFemale = new ImplPJL();
	}

	/**
	 * 生意兴隆啊
	 * 
	 * @param wallOfFemale
	 */
	public ImplWP(IWallOfFemale wallOfFemale) {
		this.wallOfFemale = wallOfFemale;
	}

	/*
	 * WP肯定不能再干这个了，不然就是妖怪了
	 * 
	 * @see eieboom.designpattern.proxypattern.IWallOfFemale#throwEyes()
	 */
	@Override
	public void throwEyes() {
		this.wallOfFemale.throwEyes();
	}

	/*
	 * WP已经没人要了
	 * 
	 * @see eieboom.designpattern.proxypattern.IWallOfFemale#seekStimulus()
	 */
	@Override
	public void seekStimulus() {
		this.wallOfFemale.seekStimulus();
	}

}
