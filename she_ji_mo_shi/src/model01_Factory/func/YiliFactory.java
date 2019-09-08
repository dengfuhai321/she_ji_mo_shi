package model01_Factory.func;

import model01_Factory.pojo.Milk;
import model01_Factory.pojo.Yili;

public class YiliFactory implements Factory {

	@Override
	public Milk getMilk() {
		return new Yili();
	}

}
