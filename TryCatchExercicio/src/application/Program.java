package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exception.AmountException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double initBalance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, initBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw:");
		double withdrawing = sc.nextDouble();	
		
		
		try {
		acc.withdraw(withdrawing);
		System.out.print("New Balance: " + String.format("%.2f", acc.getBalance()));
		}
		catch(AmountException e) {
			System.out.println(e.getMessage());
		}
		
		
		 sc.close();
		
		
		
		
	}

}
