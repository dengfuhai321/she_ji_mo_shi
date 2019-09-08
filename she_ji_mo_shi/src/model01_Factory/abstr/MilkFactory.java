package model01_Factory.abstr;

import model01_Factory.pojo.Mengniu;
import model01_Factory.pojo.Milk;
import model01_Factory.pojo.Telunsu;

public class MilkFactory extends AbstractFactory {

	@Override
	public Milk getMengniu() {
		return new Mengniu();// new MengniuFactory();
	}// 这里也可以返回蒙牛工厂，就变成工厂生产模式和抽象工厂模式的组合

	@Override
	public Milk getTelunsu() {
		return new Telunsu();
	}

	@Override
	public Milk getYili() {
		// TODO Auto-generated method stub
		return null;
	}

}
