package com.musala.oop;

import java.util.ArrayList;

public class BankAccount {
	
	private String name;
	private String iban;
	private double balance;
	private ArrayList<Customer> owners;
	
	public BankAccount() {
		this.iban = "12345";
		this.name = this.iban;
		this.owners = new ArrayList<Customer>();
		this.balance = 0;
	}
	
	public BankAccount(String name, String iban, ArrayList<Customer> owners) {
		this.name = name;
		this.iban = iban;
		this.owners = owners;
		this.balance = 0;
		
		for(Customer owner : owners) {
			owner.addAccount(this);
		}			

	}
	

	public ArrayList<Customer> getOwners() {
		return owners;
	}

	public void addOwner(Customer owner) {
		
		if (!owners.contains(owner)) {
			owners.add(owner);			
		}
	}
	
	public void setOwners(ArrayList<Customer> owners) {
		this.owners = owners;
	}
	
	public void deposit(double amount) {
		
		if (amount > 0) {
			this.balance += amount; 
		}
	}
	
	public void withdraw(double amount) {
		
		if (amount > 0) {
			this.balance -= amount;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getIban() {
		return iban;
	}
	
	@Override
	public String toString() {
		return name + "(" + iban + ")";
	}
}
