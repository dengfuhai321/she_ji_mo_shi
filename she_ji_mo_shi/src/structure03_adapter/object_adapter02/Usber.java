package structure03_adapter.object_adapter02;

public class Usber implements Usb {

	@Override
	public void isUsb() {
		System.out.println("usb接口");
	}

}
