package structure03_adapter.interface_adapter03;

public class Test {
	public static void main(String[] args) {
		A a = new Ashixian();// 成功实现了A接口，并且没有实现所有的方法，只构造了需要的两个
		a.a();
		a.d();
	}

}
