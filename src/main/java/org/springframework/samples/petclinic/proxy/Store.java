package org.springframework.samples.petclinic.proxy;

public class Store {

	Payment payment;

	public Store(Payment payment) {
		this.payment = payment;
	}

	public void buySomething(int pay) {
		payment.pay(pay);
	}

}
