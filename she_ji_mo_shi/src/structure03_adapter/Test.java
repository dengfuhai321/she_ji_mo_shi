package structure03_adapter;

import structure03_adapter.example01.passport.SigninForOtherService;

/*
 * 适配器模式：类适配器、对象适配器、接口适配器
 * 1、类适配器模式：原理：通过继承来实现适配器功能。
 * 2、对象适配器模式   原理：通过组合来实现适配器功能。
 * 3、接口适配器模式   原理：通过抽象类来实现适配，这种适配稍别于上面所述的适配。
 * 	spring中有以adapter结尾的大多是适配器模式
 */
public class Test {
	public static void main(String[] args) {
		SigninForOtherService service = new SigninForOtherService();
		// 不改变原来的代码也能兼顾新的需求
		// 这里也可以加策略模式，易于拓展功能
		service.loginForQQ("dasfjl23jli2eij");
	}

}
