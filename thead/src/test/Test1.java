package test;

import thead_create.Code_01;
import thead_create.Code_02;

public class Test1 {
	public static void main(String[] args) {
		Code_02 code_02 = new Code_02();// 它是继承Thread,所以本身也是线程
		code_02.start();
		Thread thread = new Thread(new Code_01());
		thread.run();

	}

}
