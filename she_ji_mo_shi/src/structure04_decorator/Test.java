package structure04_decorator;

import structure04_decorator.passport.SigninForThirdService;
import structure04_decorator.passport.SigninForThirdServiceImple;
import structure04_decorator.passport.SigninServiceImpl;

/*			装饰者模式				|		适配器模式
 * 是一种非常特别的适配器模式			|		可以不保留层级关系
 * 装饰者和被装饰者都要实现同一个接		|		适配者和被适配者可以没有必然的层级关系
 * 主要目的是为了拓展，依旧保留oop关	| 		通常采用代理或者继承的形式进行包装
 * 满足is-a的关系					|		满足has-a的关系
 * 注重的是覆盖+拓展				|		注重兼容，转换
 */
public class Test {
	public static void main(String[] args) {
		SigninForThirdService service = new SigninForThirdServiceImple(new SigninServiceImpl());
		// 装饰者模式，增强了之前接口的功能，但还是实现了之前接口的类，只是之前接口提供功能太少了
		// 现在就可以实现增强的接口，以便有更多的功能
		service.login("name", "password");
		service.loginForQQ("fasfnldsf12");

	}
}
