package com.musala.lfm.strings;

public class StringsExercise {

	public static void main(String[] args) {
		printStrings();
	}
	
	static void printStrings() {
		
		String[] strings = {"baba       ", "       Aa", "ei", "yo"};
		
		for(int i=0; i < strings.length; ++i) {
			
			String string = strings[i].trim();
			
			boolean nonVowel = false;
			
			for(int j = 0; j < string.length(); ++j) {
				
				char character = string.toLowerCase().charAt(j);
				
				if (character != 'a' && character != 'e' && character != 'i'
						&& character != 'o' && character != 'u') {
					nonVowel = true;
					break;
				}
			}
			
			if (!nonVowel) {
				System.out.println(string);
			}
		}
	}
}