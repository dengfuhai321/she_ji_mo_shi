package structure03_adapter.example01.passport;

import structure03_adapter.example01.ResultMsg;

/*
 * 稳定的方法不去动，直接继承下来
 */
public class SigninForOtherService extends SigninService {
	/*
	 * 添加qq登录的方法
	 */
	public ResultMsg loginForQQ(String openid) {
		// 1.openid是全局唯一，可以把它当做用户名
		// 2.密码默认为 QQ_EMPTY
		// 3.注册（在原有的系统上创建该用户）
		ResultMsg msg = super.regist(openid, null);
		// 4.调用原来的登录方法
		msg = super.login(openid, null);
		return msg;
	}

	/*
	 * 添加微信登录的方法
	 */
	public ResultMsg loginForWechat(String openid) {
		return null;
	}

}
