/**
 * 
 */
package eieboom.designpattern.proxypattern;

/**
 * 被WP撮合与PJL有一腿的主角Man
 * 
 * @author blackcore
 * @date 2013-11-12
 * @describe
 */
public class Executor {
	public void Execute() {
		System.out.println("默认WP是PJL的代理人……");

		// WP搭线
		ImplWP wp = new ImplWP();
		// Man就和PJL干上了
		wp.throwEyes();// 虽然WP在前台操纵，但真正干起来的却是PJL
		wp.seekStimulus();
		System.out.println(System.getProperty("line.separator"));

		System.out.println("WP又搭上一档SS代理人的生意……");
		// WP又搭上一档SS代理人的生意
		ImplSS ss = new ImplSS();
		wp = new ImplWP(ss);
		wp.throwEyes();
		wp.seekStimulus();

	}
}
