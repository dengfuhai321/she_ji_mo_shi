package action03_weipai_model;

import action03_weipai_model.delegate.Leader;

/*
 * 委派模式：就是静态代理和策略模式一种特殊的组合
 * 代理模式注重的是过程（代理目标对象做一些事情），委派模式注重的是结果（boss把工作委派给项目经理，只要项目成果）。
 * 策略模式注重的是可扩展（外部扩展），
 * 委派模式注重的是内部的灵活和复用。
 * 	 以Delegate结尾的，Dispatcher结尾的都是委派模式
 */
public class Test {
	public static void main(String[] args) {
		// 我是boss，我要给项目经理leader下命令登录
		new Leader().doSomething("登录");
	}

}
