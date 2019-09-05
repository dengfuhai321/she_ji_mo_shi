package thead_create;

public class Code_01 implements Runnable {

	@Override
	public void run() {
		System.out.printf("nihao!I,m %s%n", Thread.currentThread().getName());
	}

}
