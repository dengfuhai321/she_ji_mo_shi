package model01_Factory.abstr;

import model01_Factory.pojo.Milk;

/*
 * 抽象工场是用户的主入口
 * 		只要用户获得该抽象对象，就清楚地直到自己需要什么，而且只提供给用户选择的机会
 */
public abstract class AbstractFactory {
	/**
	 * 获得蒙牛品牌的牛奶
	 * 
	 * @return
	 */
	public abstract Milk getMengniu();

	/**
	 * 获得特仑苏品牌的牛奶
	 * 
	 * @return
	 */
	public abstract Milk getTelunsu();

	/**
	 * 获得伊利品牌的牛奶
	 * 
	 * @return
	 */
	public abstract Milk getYili();

}
