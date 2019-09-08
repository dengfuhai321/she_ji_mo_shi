package action01_strategy.pay;

import action01_strategy.pay.payport.Pay_type;

public class Test {
	public static void main(String[] args) {
		// 省略了把商品添加到购物车和从购物车下单
		// 直接从点单开始
		Order order = new Order("1", "201902890008", 34.78);
		// 然后开始支付
		// 这里是策略模式，pay的时候，内部有一个接口，可以实现接口有丰富的支付方式
		// 并且这里使用枚举类型，是用户只有选择权
		PayState pay = order.pay(Pay_type.ALI_PAY);
		System.out.println(pay);
	}

}
