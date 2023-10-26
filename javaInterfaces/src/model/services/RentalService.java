package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	//This CarRental points to other class called Car rental
	public void processInvoice(CarRental carRental) {
		//CarRental has method and a attribute called Invoice
		//This setInvoice points to a class called Invoice
		//I'm putting fixed arguments because it is easier to maintain.
		carRental.setInvoice(new Invoice(50.0, 10.0));
	}
	
}
