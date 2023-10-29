package model.entities;

import java.time.LocalDate;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private Installment installment;
	
	public Contract(Integer number, LocalDate data, Double totalValue) {
		this.number = number;
		this.date = data;
		this.totalValue = totalValue;
	}
	

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Installment getInstallment() {
		return installment;
	}

	public void setInstallment(Installment installment) {
		this.installment = installment;
	}
	
	
	
	
}
