package model03_prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/*
 * 这种不加处理的克隆是浅复制，复制出来的对象不同，但是对象中的属性相同
 * 这里使用序列化和反序列化后的对象不同，来实现深克隆
 */
public class Qitiandasheng extends Monkey implements Cloneable, Serializable {
	public JingGuBang jinggubang;

	public Qitiandasheng() {
		this.birthday = new Date();
		this.jinggubang = new JingGuBang();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Object deepclone() {
		try {
			// 可以捕获内存缓存中的数据，转换成字节数组。
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			ObjectOutputStream stream = new ObjectOutputStream(outputStream);
			stream.writeObject(this);
			// 可以将字节数组转化为输入流
			ByteArrayInputStream input = new ByteArrayInputStream(outputStream.toByteArray());
			ObjectInputStream objectInputStream = new ObjectInputStream(input);
			Qitiandasheng copy = (Qitiandasheng) objectInputStream.readObject();
			copy.birthday = new Date();
			return copy;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}
}
