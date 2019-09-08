package action01_strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * 策略模式：比较器,旅行路线，固定算法，买东西结算支付
 * 特征：	封装变化的概念。
		编程中使用接口，而不是使用的是具体的实现类(面向接口编程)。
 */
public class Celue_Model {
	// 比如比较器
	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();
		// 实现比较器接口的具体算法
		Comparator c = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// 比较器，你可以在这里设计规则，比如加法
				return 0;
			}

		};
		Comparator c1 = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// 比较器，你可以在这里设计规则，比如减法
				return 0;
			}

		};
		// 这里拿你指定的固定的规则来排序，这就是策略
		// 可以使用不同的实现了接口的算法比较器来排序
		list.sort(c);// 传入接口，达到不同的目的
		list.sort(c1);

	}

}
