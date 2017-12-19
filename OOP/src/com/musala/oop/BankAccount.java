package com.musala.oop;

public class BankAccount {

	private String name;
	private String iban;
	private Customer owner;
	private double balance;
	
	public BankAccount() {
		iban = "12345";
		name = iban;
		balance = 0;
	}
	
	public BankAccount(String name, String iban, Customer owner) {
		this.name = name;
		this.iban = iban;
		this.owner = owner;
		this.balance = 0;
		
		owner.addAccount(this);
	}
	
	public void deposit(double amount) {
		
		if (amount > 0) {
			this.balance += amount; //this.balance = this.balance + amount;
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
	
	public void setOwner(Customer owner) {
		
		if (owner != null) {
			this.owner = owner;
			owner.addAccount(this);
		}
	}
	
	@Override
	public String toString() {
		return name + "(" + iban + ")";
	}
}