package action04_observer;

/*
 * 观察者模式：包含四个角色
 * 		抽象被观察者角色，抽象观察者角色，具体被观察角色，具体观察者角色
 * 观察者模式：定义对象之间的一种一对多的依赖关系，使得每当一个对象状态发生改变时其相关依赖对象皆得到
 * 通知并被自动更新！
 */
public class Test {

	public static void main(String[] args) {
		// 有一个微信公众号服务，不定时发布一些消息，关注公众号就可以收到推送消息，取消关注就收不到推送消息。
		WechatServer meinv = new WechatServer();
		Observer user = new User("zhangsan");
		Observer user1 = new User("xiaodeng");
		Observer user2 = new User("xiaopang");
		meinv.addObserver(user);
		meinv.addObserver(user1);
		meinv.addObserver(user2);
		meinv.setInfomation("java天下无敌");
		// zhangsan取消关注微信公共号后就看不到消息了
		meinv.removeObserver(user);
		meinv.setInfomation("java天下无敌he ");

	}

}
