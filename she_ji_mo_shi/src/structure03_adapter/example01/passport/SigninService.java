package structure03_adapter.example01.passport;

import action02_template_method.template.entity.Member;
import structure03_adapter.example01.ResultMsg;

/*
 * 假如我的登录注册功能已经写的很完善了，但是此时需要添加qq登录或者微信登录，不想再更改了，
 * 此时就需要用到适配器模式
 */
public class SigninService {
	/*
	 * 注册方法
	 */
	public ResultMsg regist(String name, String password) {
		return new ResultMsg(200, "注册成功", new Member());
	}

	/*
	 * 登录方法
	 */
	public ResultMsg login(String name, String password) {
		return null;
	}

}
