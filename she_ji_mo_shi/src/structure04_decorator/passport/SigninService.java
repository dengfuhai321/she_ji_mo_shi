package structure04_decorator.passport;

/*
 * 假如我的登录注册功能已经写的很完善了，但是此时需要添加qq登录或者微信登录，不想再更改了，
 * 此时就需要用到适配器模式
 */
public interface SigninService {
	/*
	 * 注册方法
	 */
	public ResultMsg regist(String name, String password);

	/*
	 * 登录方法
	 */
	public ResultMsg login(String name, String password);

}
