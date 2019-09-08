package model01_Factory.func;

import model01_Factory.pojo.Mengniu;
import model01_Factory.pojo.Milk;

public class MengniuFactory implements Factory {

	@Override
	public Milk getMilk() {
		return new Mengniu();
	}

}
