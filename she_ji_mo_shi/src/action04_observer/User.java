package action04_observer;

public class User implements Observer {
	private String name;

	public User(String name) {
		this.name = name;
	}

	@Override
	public void updata(String message) {
		System.out.println(name + "收到推送消息：" + message);

	}

}
