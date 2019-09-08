package structure03_adapter.class_adapter01;

public class Usber implements Usb {

	@Override
	public void isUsb() {
		System.out.println("usb接口");
	}

}
