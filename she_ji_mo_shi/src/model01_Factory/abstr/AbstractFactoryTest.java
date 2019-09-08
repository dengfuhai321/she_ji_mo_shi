package model01_Factory.abstr;

/*
 * 抽象工场是用户的主入口：具有保证代码健壮性和代码的维护性简单的特点
 * 		只要用户获得该抽象对象，就清楚地直到自己需要什么，而且只提供给用户选择的机会
 * 
 * spring中应用广泛
 * 创建型模型:对于调用者来说，隐藏了复杂的逻辑结构，调用者只关心执行结果
 * 			对于工厂来说，要对结果负责，保证生产出符合规范的产品
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {

		// 获得抽象工厂对象
		MilkFactory milkFactory = new MilkFactory();
		// 对于用户来说，更加简单了
		// 这里用户只有选择的权利了，保证了代码的健壮性
		// 同时，修改内部代码时，用户操作的这里什么都不需要配置，只需要选择即可，
		// 你可以想象一下添加另外一种奶粉，对比一下抽象工厂和简单工厂和工厂模式有什么优点
		milkFactory.getMengniu();
		milkFactory.getTelunsu();
		milkFactory.getYili();

	}

}
