package com.musala.lfm;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount("savings", 1);
		
		sa.deposit(55);
		sa.deposit(100);
		
		sa.withdraw(24.5);
		sa.withdraw(1000000.5);
		sa.withdraw(11);
		
		System.out.println(sa);
		
		SavingsAccount newAccount = new SavingsAccount("sa", 10);
		newAccount.deposit(1000);
		
		newAccount.payInterest();
		newAccount.payInterest(); //has no effect
		
		System.out.println(newAccount);
		
		Account creditAccount = new CreditCardAccount("credit", 2000);
		
		creditAccount.withdraw(500);
		creditAccount.withdraw(1600);
		creditAccount.withdraw(10);
		
		System.out.println(creditAccount);
		
		Scanner scanner = new Scanner(System.in);
		
		String choice = "";
		System.out.print("Account type:");
		choice = scanner.nextLine();
		
		Account customerAccount = null;
		
		if (choice.equals("savings")) {
			customerAccount = new SavingsAccount("customer savings", 15);
		} else if (choice.equals("credit")) {
			customerAccount = new CreditCardAccount("customer credit", 1500);
		}
		
		if (customerAccount != null) {
			customerAccount.deposit(10000);
			customerAccount.withdraw(1000);
			
			if (customerAccount instanceof SavingsAccount) {
				SavingsAccount savAccount = (SavingsAccount)customerAccount;
				savAccount.payInterest();				
			}
			
			System.out.println(customerAccount.getBalance());
		}
	}
}
