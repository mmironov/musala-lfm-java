package com.musala.complexity;

import com.musala.map.HashMap;

public class Program {

	void algorithm(int n) {
		int x = 10;
		int y = x + 5;
		
		if (x > 0) {
			
		}
		
		for(int i=0; i < n; ++i) {
			
			for(int j=0; j < i; ++j) {
				
			}
		}
	}
	
	int binarySearch(int[] numbers, int x) {
		
		int begin = 0;
		int end = numbers.length - 1;
		
		while (begin <= end) {
			
			int mid = (begin + end) / 2;
			
			if (numbers[mid] == x) {
				return mid;
			}
			
			if (x < numbers[mid]) {
				end = mid - 1;
			} else {
				begin = mid + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.insert("hello", 5);
		map.insert("world", 10);
		
		System.out.println("value: " + map.get("helloo"));
		
		System.out.println(map);
	}
}
