package com.musala.oop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String name;
	private List<BankAccount> accounts;
	
	public Customer() {
		accounts = new ArrayList<>();
	}
	
	public void addAccount(BankAccount account) {
		
		if (!hasAccount(account.getIban())) {
			accounts.add(account);			
		}
	}
	
	public boolean hasAccount(String iban) {
		
		for(BankAccount account : accounts) {
			if (account.getIban().equals(iban)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void printAccounts() {
		for(BankAccount account : accounts) {
			System.out.println(account.toString());
		}
	}
	
	public double totalBalance() {
		double balance = 0;
		
		for(BankAccount account : accounts) {
			balance += account.getBalance();
		}
		
		return balance;
	}
}
