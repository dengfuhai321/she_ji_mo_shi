package model02_Singleton.threadsafe;

import java.lang.reflect.Constructor;

import model02_Singleton.lazy.LazyThree;

public class LazyThreeTest {
	public static void main(String[] args) {
		try {
			Class<?> clazz = LazyThree.class;
			// 通过反射拿到私有的构造方法
			Constructor c = clazz.getDeclaredConstructor(null);
			// 强制访问
			c.setAccessible(true);
			// 调用构造方法，相当于new一个对象，调用一次没问题
			Object o1 = c.newInstance();
			// 但是调用第二次就相当于与又new了一个相同的对象，破坏了单例的原则性
			Object o2 = c.newInstance();

			System.out.println(o1);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
