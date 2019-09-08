package structure04_decorator.passport;

/*
 * 它现在还是实现SigninService接口的类
 */
public class SigninForThirdServiceImple implements SigninForThirdService {
	private SigninService service;

	public SigninForThirdServiceImple(SigninService service) {
		this.service = service;
	}

	@Override
	public ResultMsg regist(String name, String password) {
		// TODO Auto-generated method stub
		return service.regist(name, password);
	}

	@Override
	public ResultMsg login(String name, String password) {
		// TODO Auto-generated method stub
		return service.login(name, password);
	}

	/*
	 * 添加qq登录的方法
	 */
	public ResultMsg loginForQQ(String openid) {
		// 1.openid是全局唯一，可以把它当做用户名
		// 2.密码默认为 QQ_EMPTY
		// 3.注册（在原有的系统上创建该用户）
		ResultMsg msg = this.regist(openid, null);
		// 4.调用原来的登录方法
		msg = this.login(openid, null);
		return msg;
	}

	/*
	 * 添加微信登录的方法
	 */
	public ResultMsg loginForWechat(String openid) {
		return null;
	}

}
