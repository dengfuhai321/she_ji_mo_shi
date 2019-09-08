package structure01_proxy.dynamic_cglib;

public class CglibTest {
	public static void main(String[] args) {
		try {
			Zhangsan object = (Zhangsan) new CglibMeipo().getIntance(Zhangsan.class);
			object.findlove();

			System.out.println("------------------");
			System.out.println(object.getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
