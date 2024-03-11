package model02_Singleton.hungry;

/*单例模式初衷就是为了使资源可以共享，只需要赋值或者初始化一次，大家就可以重复使用
 * 单例模式中：饿汉式：不管你有没有调用，我先new出来，不存在线程安全问题
 */
public class Hungry {

	private Hungry() {// private 不允许默认构造方法实例化对象

	}

	// 程序运行时，加载到内存中，不再变化(变量引用)，每次返回的都是同一个hungry
	private static final Hungry hungry = new Hungry();

	public static Hungry getinstance() {

		return hungry;
	}

}
