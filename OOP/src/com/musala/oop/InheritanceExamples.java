package com.musala.oop;

import java.util.Arrays;

public class InheritanceExamples {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
				
		BankAccount[] accounts = new BankAccount[3];
		accounts[0] = new CreditCardAccount("Credit", "12345", Arrays.asList(c1, c2), 1000);
		accounts[1] = new SavingsAccount("Savings10", "22222", Arrays.asList(c1), 3);
		accounts[2] = new SavingsAccount("Savings60", "66666", Arrays.asList(c2), 10);
		
//		Random rand = new Random();
//		int randomNumber = rand.nextInt(2);
//		
//		if (randomNumber == 0) {
//			accounts[1] = new SavingsAccount("Savings10", "22222", owners, 3);
//		} else {
//			accounts[1] = new CreditCardAccount("Savings10", "22222", owners, 3000);
//		}
		
		for(int i=0; i < accounts.length; ++i) {
			accounts[i].deposit(6000);
		}
		
		for(int i=0; i < accounts.length; ++i) {
			
			if (accounts[i] instanceof SavingsAccount) {
				((SavingsAccount)accounts[i]).payInterestNow();
			}
			
			accounts[i].withdraw(6500);
		}
		
		for(int i=0; i < accounts.length; ++i) {
			System.out.println("Balance: " + accounts[i].getBalance());
		}
		
		System.out.println("Total balance: " + c2.totalBalance());
	}
}
