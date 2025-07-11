package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		account = new Account (number, holder, balance, withdrawLimit);
		
		
		System.out.print("\nEnter amount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			account.withdraw(amount);
			System.out.printf("New balance: %.2f", account.getBalance());
		} catch (DomainExceptions e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} 
		
		sc.close();	

	}

}
