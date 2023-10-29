package model.services;

import java.time.LocalDate;
import java.util.ArrayList;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	
	public ContractService() {
		
	}
	
	
	//Months é a quantidade de parcelas/meses
	public void processContract(Contract contract, Integer months, OnlinePaymentService onlinePaymentService) {
		// o valor do contrato
		double contractValue = contract.getTotalValue();
		// o valor divido 
		double contractInstallment =  contractValue / months;
		LocalDate date = contract.getDate();
		
		ArrayList<Installment> cnt = new ArrayList<Installment>();
		
		for(int i = 1; i <= months; i++) {
			double realInterest = onlinePaymentService.interest(contractInstallment, months);
			double amountSumInterest = realInterest + contractInstallment;
			double simpleFee = onlinePaymentService.paymentFee(amountSumInterest);
			double theSumOfFee = simpleFee + realInterest;
			//Valor final do contrato
			double contractPrice = theSumOfFee + contractInstallment;
			
			LocalDate nextMonth = date.plusMonths(i);
			System.out.println(nextMonth);
			System.out.println(contractPrice);
		}
		
		
		
	}
}
