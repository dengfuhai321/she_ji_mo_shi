package action01_strategy.pay.payport;

import action01_strategy.pay.PayState;

public class Wechat_pay implements Payment {

	@Override
	public PayState pay(String uid, double amount) {
		System.out.println("欢迎使用微信支付");
		System.out.println("查直接从微信红包中询账户余额，开始扣款");
		return new PayState(200, "支付成功", amount);
	}

}
