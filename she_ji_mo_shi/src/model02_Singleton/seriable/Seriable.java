package model02_Singleton.seriable;

import java.io.Serializable;

/*
 * 		！序列化和反序列化保持单例模式
 * 单例模式 中的饿汉式在序列化和反序列化时就会出现线程安全问题，
 * 原因是在对象在序列化和反序列化后就变成两个不一样的对象了，
 * 因此单例模式实例化时需要重写readResolve这个方法
 */
public class Seriable implements Serializable {
	private Seriable() {

	}

	private static final Seriable instance = new Seriable();

	public static Seriable getinstance() {
		return instance;
	}

	// 重写这个方法
	private Object readResolve() {
		return instance;
	}

}
