package model01_Factory.simple;

import model01_Factory.pojo.Mengniu;
import model01_Factory.pojo.Milk;
import model01_Factory.pojo.Telunsu;
import model01_Factory.pojo.Yili;

public class SimpleFactory {
	public Milk getMilk(String name) {
		if ("特仑苏".equals(name)) {
			return new Telunsu();
		} else if ("蒙牛".equals(name)) {
			return new Mengniu();
		} else if ("伊利".equals(name)) {
			return new Yili();
		}
		return null;
	}

}
