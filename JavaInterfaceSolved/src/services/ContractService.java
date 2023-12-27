package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService  onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	
	public void processConctract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i=1; i<=months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			//This is adding  CONTRACT -> INSTALLMENT MEMORY
			contract.getInstalments().add(new Installment(dueDate, quota));
			
		}
		
	}
}
