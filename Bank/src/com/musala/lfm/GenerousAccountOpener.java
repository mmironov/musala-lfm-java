package com.musala.lfm;

public class GenerousAccountOpener implements AccountOpener {
	
	@Override
	public void open(Account account) {
		account.deposit(10000);
	}
}
