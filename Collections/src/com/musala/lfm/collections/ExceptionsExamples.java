package com.musala.lfm.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsExamples {

	public static void main(String[] args) {
		
		try {
			copy("file.txt");			
		} catch (LfmException e) {
			System.out.println(e.getStudentName());
		}
	}
	
	private static void copy(String sourceFilename) throws LfmException {
		
		try {
			System.out.println("Before opening file");
			FileInputStream in = new FileInputStream(sourceFilename);	
			System.out.println("After opening file");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			LfmException lfmE = new LfmException("Failed", e);
			lfmE.setStudentName("Miro");
			throw lfmE;
		}
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		System.out.println("After the try-catch.");
	}
}
