package action01_strategy.pay.payport;

import action01_strategy.pay.PayState;

public interface Payment {

	public PayState pay(String uid, double amount);
}
