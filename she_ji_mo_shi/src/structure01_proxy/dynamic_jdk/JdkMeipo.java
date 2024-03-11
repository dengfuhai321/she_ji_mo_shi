package structure01_proxy.dynamic_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * jdk动态代理原理：
 * 1.拿到被代理对象的引用，并且获取到他所有的接口，反射获取的
 * 2.Jdk Proxy类重新生成一个新的类，同时新的类要实现被代理类所实现的所有接口
 * 3.动态生成java代码，把新加的业务逻辑由一定的逻辑代码去调用
 * 4.编译形成新的Java代码.class
 * 5.再重新加载到jvm中运行
 * 以上过程叫做字节码重组
 */
public class JdkMeipo implements InvocationHandler {
	// 被代理的对象，把引用保存下来
	private Person target;

	public Object getIntance(Person target) throws Exception {
		this.target = target;

		Class<?> clazz = target.getClass();
		// 返回代理
		// 用来生成一个新的对象（字节码重组来实现）第三个参数需要让该类implements InvocationHandler
		// ，这里的this就是JdkMeipo
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是媒婆，我已经直到你的需求了，这就给你找对象了");
		System.out.println("开始物色");
		Object invoke = method.invoke(this.target, args);// 这里是调用目标对象的方法
		System.out.println("如果合适的话就准备彩礼把");
		return invoke;
	}

}
