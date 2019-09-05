package thead_create;

public class Code_02 extends Thread {
	@Override
	public void run() {
		System.out.printf("nihao!I,m %s%n", Thread.currentThread().getName());
	}
}