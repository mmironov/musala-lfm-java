package com.musala.lfm;

public class Program {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		
		byte b = 10;
		short s = 100;
		int x = 10;
		long y = 10000l;
		
		float fl = 10.5f;
		double db = 10.20; 
		
		boolean bool = ((true || false) && true) ^ true;
		
		boolean firstExpr = false;
		boolean secondExpr = true;
		boolean result = firstExpr ^ secondExpr;
		
		char character = 'a';
		
		String str = "123";
		
		int sum = ( (x + x) * 10 ) / 20;
		int result2 = 5 % 2;
		
		int number = 100;
		
		System.out.println(number);
		
//		for(int i=0; i < 100; ++i) {
//			System.out.println(i);
//		}
		
		Student student = new Student();
		student.isUnderAge();
		student.setFirstName("Miroslav");
		student.setAge(14);
		
		System.out.println(student);
	}
}