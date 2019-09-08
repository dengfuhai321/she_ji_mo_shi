package action03_weipai_model.delegate;

public class TargetA implements Working {

	@Override
	public void doSomething(String command) {
		System.out.println("我是员工A，现在开始干" + command + "");
	}

}
