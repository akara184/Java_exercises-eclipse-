package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy)");
		LocalDate data = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double contrato = sc.nextDouble();
		System.out.print("Entre com o numero de parcelas: ");
		int parcelas = sc.nextInt();
		System.out.println();
		
		Contract contract = new Contract(numero, data, contrato);
		
		ContractService service = new ContractService();
		
		
		System.out.println("Parcelas:");
		service.processContract(contract, parcelas, new PaypalService());
		



	}

}
