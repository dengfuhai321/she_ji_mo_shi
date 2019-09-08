package action02_template_method.cooking;

public class Test {
	public static void main(String[] args) {
		// 抽象类无法实例化
		// 含有抽象方法的类也无法实例化
		// 5.抽象的子类必须实现抽象类中所有抽象方法，否则这个子类也是抽象类。
		DodishTemplate eggsWithTomato = new EggsWithTomato();
		eggsWithTomato.dodish();

		System.out.println("-----------------------------");

		DodishTemplate bouilli = new Bouilli();
		bouilli.dodish();
	}

}
