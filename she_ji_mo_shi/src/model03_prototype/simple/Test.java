package model03_prototype.simple;

/*
 *原型模式：创建型模式
 *数据库查询出来的数据赋值给DTO,MVC中的model把DTO中的值赋值给vo，再把vo传到view中
 *所谓原型模式就是java中的克隆技术，以某个对象为原型，复制出新的对象，新的对象具有原对象
 *属性特点，效率高
 *
 *这个是浅复制，不管你怎么克隆，克隆出来的对象虽然是不一样的，但是对象中的属性用的是同一个地址，
 *也就是同一个属性list，不太好
 *所以在spring中克隆出来的对象的属性都不是引用的同一个地址，就需要使用反射，把原对象的
 *属性for循环赋值给克隆出来的对象的属性
 */
public class Test {
	public static void main(String[] args) {
		Prototype p = new Prototype();
		p.name = "xiaodeng";
		p.list.add("chishi");
		System.out.println(p);

		try {
			Prototype clone = (Prototype) p.clone();
			System.out.println(clone);
			System.out.println(clone.list == p.list);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
