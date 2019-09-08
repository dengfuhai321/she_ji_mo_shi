package action01_strategy.pay;

import action01_strategy.pay.payport.Pay_type;

public class Order {
	private String uid;
	private String orderId;
	private double amount;

	public Order(String uid, String orderId, double amount) {
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}

	public PayState pay(Pay_type payment) {
		return payment.get().pay(uid, amount);

	}

}
