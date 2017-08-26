package com.musala.lfm.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("abc");
		set.add("123");
		set.add("abc");
		
		if (set.contains("abc")) {
			set.remove("abc");
		}
		
		System.out.println(set);
	}
}