package structure03_adapter.object_adapter02;

/*2、对象适配器模式
　　原理：通过组合来实现适配器功能。(就是往适配器中传入需要功能的类)
 * 适用场景：当我们要访问的接口A中没有我们想要的方法 ，却在另一个接口B中发现了合适的方法，
 * 我们又不能改变访问接口A，
 * 我们可以定义一个适配器p来进行中转，在创建适配器的同时需要传入需要的方法所在的类，适配器就可以使用
 * 我们需要的方法了，这个适配器p要实现我们访问的接口A，这样我们就能继续访问当前接口A中的方法
 * 
 */
public class Adapter implements Ps2 {
	private Usb usb;

	public Adapter(Usb usb) {
		this.usb = usb;
	}

	@Override
	public void isPs2() {
		usb.isUsb();
	}

}
