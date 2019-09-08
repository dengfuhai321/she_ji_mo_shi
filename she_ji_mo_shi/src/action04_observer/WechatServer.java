package action04_observer;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {
	private List<Observer> list = null;
	private String message;

	public WechatServer() {
		list = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer ob) {
		list.add(ob);

	}

	@Override
	public void removeObserver(Observer ob) {
		list.remove(ob);

	}

	/*
	 * 通知关注这个公众号的所有观察者
	 * 
	 */
	@Override
	public void notifynotice() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).updata(message);
		}

	}

	public void setInfomation(String s) {
		this.message = s;
		System.out.println("微信服务更新消息：" + s);
		// 消息更新，通知所有观察者
		notifynotice();

	}

}
