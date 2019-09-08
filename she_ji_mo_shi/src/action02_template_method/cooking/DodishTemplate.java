package action02_template_method.cooking;

/*
 * 先来写一个抽象的做菜父类：  
 */
public abstract class DodishTemplate {

	/**
	 * 具体的整个过程
	 */
	protected void dodish() {
		this.preparation();// （1）备料
		this.doing();// （2）具体做菜
		this.carriedDishes();// （3）盛菜端给客人享用
	}

	/**
	 * 备料
	 */
	public abstract void preparation();

	/**
	 * 做菜
	 */
	public abstract void doing();

	/**
	 * 上菜
	 */
	public abstract void carriedDishes();
}