package model01_Factory.func;

/*
 * 工厂式的工厂成产模式：定义一个牛奶工厂接口返回牛奶，每种牛奶制造厂实现牛奶工厂生产自己牌的牛奶
 * 
 */
public class FactoryTest {
	public static void main(String[] args) {
		// 创建出各个牌子的牛奶工厂
		MengniuFactory factory = new MengniuFactory();
		TelunsuFactory factory2 = new TelunsuFactory();
		YiliFactory factory3 = new YiliFactory();

		System.out.println(factory.getMilk());
		System.out.println(factory2.getMilk());
		System.out.println(factory3.getMilk());

	}

}
