package structure04_decorator.passport;

public interface SigninForThirdService extends SigninService {
	// 要添加的功能
	public ResultMsg loginForQQ(String openid);

	public ResultMsg loginForWechat(String openid);

}
