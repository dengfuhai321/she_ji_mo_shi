package model02_Singleton.threadsafe;

import java.util.concurrent.CountDownLatch;

import model02_Singleton.lazy.LazyThree;
import model02_Singleton.register.RegisterEnum;

/*
 * 用来测试模式是否是线程安全的
 */
public class ThreadSafeTest {

	public static void main(String[] args) {
		int count = 100;
		CountDownLatch latch = new CountDownLatch(count);// 初始化，指定线程个数
		for (int i = 0; i < count; i++) {

			new Thread() {
				public void run() {

					try {
						// 阻塞，count=0的时候会释放所有的共享锁，然后万箭齐发
						latch.await();// 阻塞该线程，等待其他子线程完成
						Object getinstance = LazyThree.getinstance();
						System.out.println(System.currentTimeMillis() + ":" + getinstance);// 输出当前时间
					} catch (Exception e) {
						e.printStackTrace();
					}
				};
			}.start();

			latch.countDown();// 代表一个线程执行完成，待完成的线程数减1

		}
		RegisterEnum.INSTANCE.getinstance();// 这也是单例模式
		RegisterEnum.INSTANCE.getinstance();// 这也是单例模式
		System.out.println();

	}

}
