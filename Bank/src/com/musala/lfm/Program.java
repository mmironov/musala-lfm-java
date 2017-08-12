package com.musala.lfm;


public class Program {

	public static void main(String[] args) {
		Account account = new Account("lots of money");
		account.deposit(1000);
		account.deposit(25);
		
		account.lock();
		
		account.withdraw(1000000);
		
		account.open();
		account.withdraw(50);
		
		System.out.println(account);
		
		SavingsAccount sa = new SavingsAccount("savings", 1);
		
		sa.deposit(55);
		sa.deposit(100);
		
		sa.withdraw(24.5);
		sa.withdraw(1000000.5);
		
		System.out.println(sa);
		
		SavingsAccount newAccount = new SavingsAccount("sa", 10);
		newAccount.deposit(1000);
		
		newAccount.payInterest();
		newAccount.payInterest(); //has no effect
		
		System.out.println(newAccount);
	}
}