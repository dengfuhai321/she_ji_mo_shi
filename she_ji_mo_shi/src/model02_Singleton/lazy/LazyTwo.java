package model02_Singleton.lazy;

/*
 * 单例模式中：懒汉式：默认加载的时候不实例化，在需要用到这个的时候才实例化，延时加载
 * 懒加载线程不安全，但是可以加锁机制，或者其他方式
 * 这里加锁了，所以变成线程安全的了，但是性能会下降许多
 */
public class LazyTwo {
	private LazyTwo() {

	}

	private static LazyTwo lazy = null;

	public static synchronized LazyTwo getinstance() {
		if (lazy == null) {
			lazy = new LazyTwo();
		}
		return lazy;
	}

}
