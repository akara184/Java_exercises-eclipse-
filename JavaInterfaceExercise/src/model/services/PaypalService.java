package model.services;

public class PaypalService implements OnlinePaymentService{

	public double paymentFee(Double amount) {
		double fee = 0.02 * amount ;
		return fee;	
	}

	public double interest(Double amount, Integer months) {
		double interest = amount * ((double)months/ 100) ;
		return interest;
	}

}
	