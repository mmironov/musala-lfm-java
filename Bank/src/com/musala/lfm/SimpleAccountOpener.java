package com.musala.lfm;

public class SimpleAccountOpener implements AccountOpener {

	@Override
	public void open(Account account) {
		account.setIban(generateIban());
	}
	
	private static String generateIban() {
		return "AAA";
	}
}
