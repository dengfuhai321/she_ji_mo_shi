package structure03_adapter.interface_adapter03;

/*3、接口适配器模式
　　原理：通过抽象类来实现适配，这种适配稍别于上面所述的适配。
 * 适用场景：当存在这样一个接口，其中定义了N多的方法，而我们现在却只想要实现了其中的一个到几个方法的
 * 接口类，如果我们直接实现接口，那么我们要对所有的方法进行实现，就有点臃肿，
 * 
 * 这时我们可以使用一个抽象类作为中间件，即适配器，用这个抽象类实现接口，而在抽象类中所有的方法都
 * 进行置空，那么我们在创建抽象类的继承类，而且重写我们需要使用的那几个方法即可。
 */
public abstract class Adapter implements A {
	public void a() {
	}

	public void b() {
	}

	public void c() {
	}

	public void d() {
	}

	public void e() {
	}

	public void f() {
	}
}
