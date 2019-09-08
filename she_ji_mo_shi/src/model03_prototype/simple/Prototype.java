package model03_prototype.simple;

import java.util.ArrayList;
import java.util.List;

/*
 * 原型模式：创建型模式
 * 就是克隆出新的对象
 */
public class Prototype implements Cloneable {
	public String name;
	public List list = new ArrayList<String>();

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
