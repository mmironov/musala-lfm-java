package com.musala.lfm;

public class Main {

	public static void main(String[] args) {
		
		Notepad notepad = new SecureNotepad(3);
		
		notepad.addTextTo("Hello World", 1);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notepad.addTextTo("Long long text", 2);
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		notepad.addTextTo("Short text", 3);
		
		System.out.println(notepad);
		
	}
}
