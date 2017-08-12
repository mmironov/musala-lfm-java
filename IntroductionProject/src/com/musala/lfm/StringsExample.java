package com.musala.lfm;

public class StringsExample {

	public static void main(String[] args) {
		
		String hello = "   hello";
		String world = "world   ";
		
		String helloWorld = hello + ", " + world + world;
		
		helloWorld += "!";
		
		String str = helloWorld;
		
		System.out.println(helloWorld);
		
		System.out.println("Length: " + str.length());
		System.out.println("Char at: " + str.charAt(1));
		System.out.println("IsPrefix: " + str.startsWith("hello"));
		System.out.println("substring: " + str.substring(2, 5));
		System.out.println("first index of: " + str.indexOf("world"));
		System.out.println("replace: " + str.replace("world", "planet"));
		System.out.println("trim: " + str.trim());
		
		System.out.println(str);
	}
}
