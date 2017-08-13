package com.musala.lfm;

import java.util.Scanner;

public class SecureNotepad extends Notepad {

	private static final int MAX_ATTEMPS = 3;
	private static final int TRUST_INTERVAL = 5; //in seconds
	
	private Scanner scanner = new Scanner(System.in);
	private String password;
	
	private int wrongAttempts;
	
	private boolean blocked;
	
	private long lastSuccessfulAttempTimestamp;
	
	public SecureNotepad(int numberOfPages) {
		super(numberOfPages);
		
		assignNewPassword();
		wrongAttempts = 0;
		blocked = false;
	}
	
	private void assignNewPassword() {
		System.out.print("Enter password: ");
		String password = scanner.nextLine();
		
		if (!isPasswordValid(password)) {
			System.out.print("Password not valid!");
			assignNewPassword();
		} else {
			System.out.print("Confirm password: ");
			String confirmed = scanner.nextLine();
			
			if (password.equals(confirmed)) {
				this.password = password;
			} else {
				System.out.print("Passwords do not match");
				assignNewPassword();
			}
		}
	}
	
	private boolean isPasswordValid(String password) {
		return password != null && password.length() > 3;
	}
	
	private String requestPassword() {
		System.out.print("Enter password to change the notepad: ");
		String password = scanner.nextLine();
		return password;
	}
	
	private boolean authorize() {
		if (isBlocked()) {
			return false;
		}
		
		long current = System.currentTimeMillis();
		long diff = (current - lastSuccessfulAttempTimestamp) / 1000;
		
		if (diff <= TRUST_INTERVAL) {
			return true;
		}
		
		String password = requestPassword();
		
		if (this.password.equals(password)) {
			wrongAttempts = 0;
			lastSuccessfulAttempTimestamp = System.currentTimeMillis();
			return true;
		} else {
			++wrongAttempts;
			
			if (wrongAttempts >= MAX_ATTEMPS) {
				block();
				System.out.println("This notepad has been blocked!");
				return false;
			} else {
				return authorize();
			}
		}
	}
	
	@Override
	public void addTextTo(String text, int pageNumber) {
		
		if (authorize()) {
			super.addTextTo(text, pageNumber);
		}
	}
	
	private void block() {
		this.blocked = true;
	}
	
	private boolean isBlocked() {
		return blocked;
	}
}
