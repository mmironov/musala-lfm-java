package com.musala.oop;

public class ObjectExamples {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		BankAccount mainAccount = new BankAccount();
		mainAccount.deposit(1000);
		mainAccount.deposit(500);
		mainAccount.withdraw(150);
		
		BankAccount anotherAccount = mainAccount;
		
		System.out.println("Balance: " + mainAccount.getBalance());
		
		Customer me = new Customer();
						
		Customer you = new Customer();
		
		System.out.println();
		
		me.printAccounts();
	}
}
