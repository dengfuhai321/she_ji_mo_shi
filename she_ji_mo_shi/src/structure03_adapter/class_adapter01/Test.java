package structure03_adapter.class_adapter01;

/*
 * 因为你没有实现ps2接口的类，只有实现了的usb接口，
 * 所以制造一个适配器，继承实现了usb接口的类，
 * 你就可以ps2接口使用usb接口的方法
 */
public class Test {
	public static void main(String[] args) {
		// 我手中有个ps2插头的设备，但是主机上只有usb插头的插口，怎么办呢？
		Adapter adapter = new Adapter();
		// 弄个转换器，将ps2插头转换成为USB插头就可以使用了。

		adapter.isPs2();// 这个是把ps2接口变成usb接口了
	}

}
