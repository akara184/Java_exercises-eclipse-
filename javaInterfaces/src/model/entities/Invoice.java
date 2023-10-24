package model.entities;

public class Invoice {

	private Double basicPaymnet;
	private Double tax;

	public Invoice() {
		
	}

	public Invoice(Double basicPaymnet, Double tax) {
		this.basicPaymnet = basicPaymnet;
		this.tax = tax;
	}


	public Double getBasicPaymnet() {
		return basicPaymnet;
	}


	public void setBasicPaymnet(Double basicPaymnet) {
		this.basicPaymnet = basicPaymnet;
	}


	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPaymnet() - getTax();
	}
}
