package com.musala.lfm;

public class ArraysExample {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		array[0] = 10;
		array[1] = 20;
		
		int[] array2 = array;
		array2[2] = 1000;
		array[2] = 500;
		
		printArray(array);
		
		int[] initializedArray = {1, 2, 3};
	}
	
	static void printArray(int[] array) {
		
		for(int i=0; i < array.length; ++i) {
			System.out.print(array[i] + " ");
		}
	}
}
