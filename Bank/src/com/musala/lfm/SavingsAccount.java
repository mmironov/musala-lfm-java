package com.musala.lfm;


public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount(String name, double interestRate) {
		super(name);
		this.interestRate = 0.1;
		if (interestRate >= 0) {
			this.interestRate = interestRate;
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && isOpen()) {
			double newBalance = getBalance() - amount;
			
			if (newBalance >= 0) {
				super.withdraw(amount);
			}
		}
	}
}
