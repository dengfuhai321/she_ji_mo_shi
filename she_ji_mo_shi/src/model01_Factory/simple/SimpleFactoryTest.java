package model01_Factory.simple;

/*
 * 小作坊式的工厂模式：   有点类似于spring中BeanFactory生产Bean的<bean scope="prototype">
 * 用户本身不再关心生产的过程，只需要关心生产的结果
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {
		SimpleFactory factory = new SimpleFactory();
		System.out.println(factory.getMilk("特仑苏"));
		System.out.println(factory.getMilk("蒙牛"));
		System.out.println(factory.getMilk("伊利"));

	}

}
