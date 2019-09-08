package model02_Singleton.lazy;

/*
 * 这个也是单例模式：也是懒加载模式，同时也没有加锁机制，因此可能会出现线程安全问题
 * 但是，这里使用了内部类的方法，可以避免线程安全问题
 * 特点：在外部类被调用的时候内部类才会加载
 * 	完美地屏蔽了饿汉式的内存浪费，和加锁机制synchronized性能问题
 * 史上最厉害的单例模式的实现方式
 */
//单例模式初衷就是为了使资源可以共享，只需要赋值或者初始化一次，大家就可以重复使用
public class LazyThree {

	private static boolean initialed = false;

	private LazyThree() {
		// 为了防止反射直接实例化该对象
		synchronized (LazyThree.class) {
			if (initialed == false) {
				initialed = !initialed;
			} else {
				throw new RuntimeException("单例已被侵犯");
			}

		}

	}

	// 默认使用LazyThree的时候，会先初始化内部类
	// 如果没使用的话，内部类是不会加载的
	// static是为了使单例共享
	// final是为了保证这个方法不会被重写，重载
	public static final LazyThree getinstance() {
		// 在返回内部类前，一定会先加载内部类
		return LazyHolder.lazy;
	}

	// 默认这个内部类不加载
	private static class LazyHolder {
		private static final LazyThree lazy = new LazyThree();
	}

}
