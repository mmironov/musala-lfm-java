package com.musala.lfm;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter integer: ");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("x = " + (x + y));
		
		String str = scanner.nextLine();
		System.out.println(str);
	}
}
