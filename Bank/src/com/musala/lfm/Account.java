package com.musala.lfm;

public class Account {

	private String name;
	private double balance;
	private boolean isOpen;
	
	public Account() {
		this("");
	}
	
	public Account(String name) {
		this(name, 0, true);
	}
	
	public Account(String name, double balance, boolean isOpen) {
		this.name = "";
		setName(name);
		this.balance = balance;
		this.isOpen = isOpen;
	}
	
	public void setName(String name) {
		
		if (name != null) {			
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	
	public void withdraw(double amount) {
		
		if (amount > 0 && isOpen()) {
			balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		
		if (amount > 0 && isOpen()) {
			balance += amount;
		}
	}
	
	public void open() {
		isOpen = true;
	}
	
	public void lock() {
		isOpen = false;
	}
	
	@Override
	public String toString() {
		
		String status = isOpen ? "open" : "locked";
		
		return name + " (" + balance + "): " + status;
	}
}