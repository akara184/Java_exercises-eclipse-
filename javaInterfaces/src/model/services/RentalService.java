package model.services;

import java.time.Duration;
import java.util.regex.Matcher;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	//This CarRental points to other class called Car rental
	public void processInvoice(CarRental carRental) {
		//CarRental has method and a attribute called Invoice
		//This setInvoice points to a class called Invoice
		//I'm putting fixed arguments because it is easier to maintain.
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			//Math.ceil is a function that rounding numbers
			basicPayment = pricePerHour * Math.ceil(hours) ;
		}else {
			
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
