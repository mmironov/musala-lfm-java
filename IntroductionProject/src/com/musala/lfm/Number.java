package com.musala.lfm;

public class Number {

	public static void main(String[] args) {
		long i = 5;
		float f = 5;
	}
}

interface Listener {
	default void onClick() {
		System.out.println("Listener");
	}
}

interface Watcher {
	default void onClick() {
		System.out.println("Watcher");
	}
}