package structure03_adapter.class_adapter01;

/*1、类适配器模式：
 * 原理：通过继承来实现适配器功能。
 * 适用场景：当我们要访问的接口A中没有我们想要的方法 ，却在另一个接口B中发现了合适的方法，
 * 我们又不能改变访问接口A，
 * 我们可以定义一个适配器p来进行中转，这个适配器p要实现我们访问的接口A，这样我们就能继续访问
 * 当前接口A中的方法，然后再继承接口B的实现类BB，就可以在访问A接口的同时，使用b接口的方法
 */
public class Adapter extends Usber implements Ps2 {

	@Override
	public void isPs2() {
		super.isUsb();
	}

}
