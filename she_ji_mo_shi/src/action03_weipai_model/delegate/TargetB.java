package action03_weipai_model.delegate;

/*
 * 员工来实现具体要工作的内容
 */
public class TargetB implements Working {

	@Override
	public void doSomething(String command) {
		System.out.println("我是员工B，现在开始干" + command + "");
	}

}
