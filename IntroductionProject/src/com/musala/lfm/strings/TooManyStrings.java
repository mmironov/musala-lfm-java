package com.musala.lfm.strings;

import java.util.Arrays;

public class TooManyStrings {

	public static void main(String[] args) {
		
//		String lotsOfA = "";
//		
//		for(int i=0; i < 1000000; ++i) {
//			lotsOfA += 'a';
//		}
//		
//		System.out.println("end");
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=0; i < 1000000; ++i) {
			builder.append(" aaaa ");
		}
		
//		String string = builder.toString();
//		System.out.println(string);
//		
//		Arrays.toString(getWords(""));
		
		String word = new String("word");
		String anotherWord = new String("word");
		
		String domain = "www.musala.com";
		String url = "https://www.musala.com/lfm?target=external";
		
		System.out.println(whereToOpen(url, domain));
	}
	
	static String[] getWords(String text) {
		
		return text.toLowerCase().split(" ");
		
	}
	
	static String whereToOpen(String url, String domain) {
		
		int paramsIndex = url.indexOf("?");
		
		if (paramsIndex < 0) {
			return whereToOpenDefault(url, domain);
		}
		
		String params = url.substring(paramsIndex + 1);
		
		System.out.println(params);
		
		String[] splittedParams = params.split("&");
		System.out.println(Arrays.toString(splittedParams));
		
		for(int i=0; i < splittedParams.length; ++i) {
			String paramString = splittedParams[i];
			String[] splittedParamString = paramString.split("=");
			String name = splittedParamString[0];
			String value = splittedParamString[1];
			
			if (name.equals("target")) {
				return value;
			}
		}
		
		return whereToOpenDefault(url, domain);
	}
	
	static String whereToOpenDefault(String url, String domain) {
		
		int index = url.indexOf("://");
		if (index > -1) {
			url = url.substring(index + 3);
		}
		
		
		if (domain.startsWith("www.")) {
			domain = domain.substring(4);
		}
		
		if (url.startsWith("www.")) {
			url = url.substring(4);
		}
		
		System.out.println(url);
		
		if (url.startsWith(domain)) {
			return "internal";
		} else {
			return "external";
		}
	}
}