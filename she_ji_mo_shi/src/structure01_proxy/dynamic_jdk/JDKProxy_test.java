package structure01_proxy.dynamic_jdk;

public class JDKProxy_test {
	public static void main(String[] args) {
		try {
			Person obj = (Person) new JdkMeipo().getIntance(new Xiaodeng());
			obj.findlove();
			obj.findhouse();
			// System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
