package model02_Singleton.threadsafe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model02_Singleton.seriable.Seriable;

/*
 * 用来测试模式是否是线程安全的
 */
public class ThreadSafeSeriableTest {

	public static void main(String[] args) {
		Seriable s1 = null;
		Seriable s2 = Seriable.getinstance();
		FileOutputStream fos = null;
		try {
			// 序列化就是把内存中的状态通过转换成字节的形式
			// 从而转化成io流，写入到其他地方（磁盘或者网络io）
			// 内存中的状态就永久保存下来了
			fos = new FileOutputStream("Seriable.obj");// 文件输出对象，参数是文件名或者文件路径
			ObjectOutputStream outputStream = new ObjectOutputStream(fos);
			outputStream.writeObject(s2);// 写出去
			outputStream.flush();
			outputStream.close();
			// 再读进来
			// 反序列化
			// 将已经持久化的字节码内容转换成io流
			// 通过对io流的读取，进而将读取的内容转化成java对象
			// 在转化的过程中会重新创建对象，如果不加处理，就会造成对象重复
			FileInputStream inputStream = new FileInputStream("Seriable.obj");
			ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			s1 = (Seriable) objectInputStream.readObject();
			objectInputStream.close();
			System.out.println(s1 == s2);
			System.out.println(s1);
			System.out.println(s2);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
