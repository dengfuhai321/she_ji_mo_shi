package action03_weipai_model.delegate;

import java.util.HashMap;
import java.util.Map;

/*
 * 项目经理持有所有的小组成员，根据一定的策略选择干活的人
 * 灵活使用内部人员来完成命令
 */
public class Leader implements Working {
	private Map<String, Working> targets = new HashMap<String, Working>();

	/**
	 * 项目经理持有小组成员可供选择，类似策略模式
	 */
	public Leader() {
		targets.put("加密", new TargetA());
		targets.put("登录", new TargetB());
	}

	@Override
	public void doSomething(String command) {
		targets.get(command).doSomething(command);
	}

}
