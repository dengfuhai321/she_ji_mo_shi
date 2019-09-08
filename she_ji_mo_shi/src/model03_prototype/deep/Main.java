package model03_prototype.deep;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Qitiandasheng qitiandasheng = new Qitiandasheng();
		// 浅克隆
		Qitiandasheng clone = (Qitiandasheng) qitiandasheng.clone();
		// 序列化实现的深克隆
		Qitiandasheng deepclone = (Qitiandasheng) qitiandasheng.deepclone();

		System.out.println(qitiandasheng == clone);
		System.out.println(qitiandasheng.jinggubang == clone.jinggubang);
		System.out.println(qitiandasheng.jinggubang + "" + deepclone.jinggubang);

	}

}
