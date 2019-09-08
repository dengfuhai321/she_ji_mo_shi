package action01_strategy.pay.payport;

public enum Pay_type {
	ALI_PAY(new Ali_pay()), Wechat_PAY(new Wechat_pay()), JD_PAY(new Jd_pay());
	private Payment payment;

	Pay_type(Payment payment) {
		this.payment = payment;
	}

	public Payment get() {
		return this.payment;
	}
}
