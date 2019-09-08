package structure01_proxy.static_proxy;

//代理类
public class CatProxy implements Animal {
	// 真正要代理的类
	Cat cat;

	public CatProxy(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void action() {
		System.out.println("==========DogProxy 代理类执行开始！=============");
		// 实质上在代理类中是调用了被代理实现接口的方法
		cat.action();
		System.out.println("==========DogProxy 代理类执行结束！===========");
	}

	@Override
	public void breath() {
		System.out.println("==========DogProxy 代理类执行开始！=============");
		cat.breath();
		System.out.println("==========DogProxy 代理类执行结束！===========");
	}

}
