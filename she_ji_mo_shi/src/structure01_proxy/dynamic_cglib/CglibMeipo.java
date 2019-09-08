package structure01_proxy.dynamic_cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/*
 * 动态代理：就是在不知道目标对象是啥的情况下，产生一个代理对象，来实现对目标对象的操作
 * 为什么会产生代理呢？比如某个对象需要做其他事情，然后它还需要找对象，没有功夫找对象
 * 所以可以交给代理，让代理拿到对象的需求来编写代码找对象
 * 实际应用场景：aop面向切面
 * 
 * Cglib动态代理，是通过继承目标代理对象来产生代理对象
 */
public class CglibMeipo implements MethodInterceptor {

	public Object getIntance(Class<?> clazz) throws Exception {

		Enhancer enhancer = new Enhancer();// 这个需要导入cglib.jar和asm.jar
		// 要把那个设置成即将成为的新类父类
		enhancer.setSuperclass(clazz);

		enhancer.setCallback(this);

		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {

		System.out.println("我是媒婆，我已经直到你的需求了，这就给你找对象了");
		System.out.println("开始物色");

		arg3.invokeSuper(arg0, arg2);

		System.out.println("如果合适的话就准备彩礼把");
		return null;// 这里可以返回一个对女朋友
	}

}
