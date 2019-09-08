package structure04_decorator.passport;

public class SigninServiceImpl implements SigninService {

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
