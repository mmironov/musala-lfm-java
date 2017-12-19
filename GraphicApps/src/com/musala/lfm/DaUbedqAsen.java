package com.musala.lfm;

public class DaUbedqAsen {

	public static void main(String[] args) {
		
		NullPointerException ex = get();
	}
	
	static <T extends Exception> T get() {
		return (T)new RuntimeException();
	}
}