package com.musala.lfm.collections;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3};
		
		array[2] = 10;
		
		ArrayList rawList = new ArrayList();
		
		rawList.add(10);
		rawList.add(50);
		rawList.add("hello");
		rawList.add(false);
		
		//ClassCastException
//		int x = (int)rawList.get(2);
		
//		System.out.println(x);
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(20);
		
		int el = list.get(0);
		System.out.println(el);
		
		
		int x = 10;
		Integer y = 20;
		Integer sum = x + y;
		
		Box<Integer> il = new Box<>(x);
		
		int value = il.get();
		
		System.out.println(il);
		
		Integer i1 = -5000;
		Integer i2 = -5000;
		
		if (i1 == i2) {
			System.out.println(129);
		}
	}
}
