package action04_observer;

/*
 * 抽象被观察者接口
 */
public interface Observerable {
	// 添加观察者
	public void addObserver(Observer ob);

	// 删除观察者
	public void removeObserver(Observer ob);

	// 通知观察者
	public void notifynotice();

}
