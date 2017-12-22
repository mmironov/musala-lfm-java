package com.musala.oop;

import java.util.List;

public class CreditCardAccount extends BankAccount {

	private double limit;
	
	public CreditCardAccount(String name, String iban, List<Customer> owners, double limit) {
		super(name, iban, owners);
		this.limit = limit;
	}
	
	public void withdraw(double amount) {
		
		if (amount > 0) {
			
			if (getBalance() - amount >= limit * (-1)) {
				super.withdraw(amount);
			}
		}
	}
}
