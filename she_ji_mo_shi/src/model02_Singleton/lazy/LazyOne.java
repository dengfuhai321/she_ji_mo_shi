package model02_Singleton.lazy;

/*
 * 单例模式中：懒汉式：默认加载的时候不实例化，在需要用到这个的时候才实例化，延时加载
 * 懒加载线程不安全，但是可以加锁机制，或者其他方式
 */
public class LazyOne {
	private LazyOne() {

	}

	private static LazyOne lazy = null;

	public static LazyOne getinstance() {
		if (lazy == null) {
			lazy = new LazyOne();
		}
		return lazy;
	}

}
