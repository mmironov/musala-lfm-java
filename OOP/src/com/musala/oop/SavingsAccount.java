package com.musala.oop;

import java.util.ArrayList;

public class SavingsAccount extends BankAccount {

	private double interestRate;
	
	private boolean isInterestPaid;
	
	public SavingsAccount(String name, String iban, ArrayList<Customer> owners,
			double interestRate) {
		super(name, iban, owners);
		this.interestRate = interestRate;
		isInterestPaid = false;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void payInterestNow() {
		
		if (!isInterestPaid) {
			double interest = getBalance() * interestRate / 100;
			deposit(interest);
			isInterestPaid = true;
		}
	}
	
	public void withdraw(double amount) {
		
		if (amount > 0) {
			if (getBalance() - amount >= 0) {
				super.withdraw(amount);
			}
		}
	}
}
