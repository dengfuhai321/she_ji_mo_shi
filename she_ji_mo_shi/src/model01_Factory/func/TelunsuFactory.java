package model01_Factory.func;

import model01_Factory.pojo.Milk;
import model01_Factory.pojo.Telunsu;

public class TelunsuFactory implements Factory {

	@Override
	public Milk getMilk() {
		return new Telunsu();
	}

}
