package com.musala.lfm.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		Map<String, String> phonebook = new HashMap<>();
		
		phonebook.put("Miro", "088");
		phonebook.put("Ivan", "088");
		phonebook.put("Georgi", "123");
		phonebook.put("Elena", "444");
		
		phonebook.remove("Elena");
		
		phonebook.put("Miro", "044");
		
		System.out.println(phonebook);
		
		String number = null;
		if (phonebook.containsKey("Georgi")) {			
			number = phonebook.get("Georgi");
		}
		
		System.out.println(number);
	}
}
