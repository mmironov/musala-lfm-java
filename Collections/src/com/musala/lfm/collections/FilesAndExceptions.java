package com.musala.lfm.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FilesAndExceptions {

	public static void main(String args[]) {
		
		File file = new File("lib");
		
		if (file.exists()) {
			System.out.println(file);
			
			System.out.println(file.getAbsolutePath());
			
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				for(int i=0; i < files.length; ++i) {
					System.out.println(files[i]);
					files[i].delete();
				}				
			}
		}
		
		copyFile("alabala.txt");
		
	}
	
	private static void copyFile(String sourceFilename) {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			final String copyDir = "system/copy";
			
			File dir = new File(copyDir);
			
			if (!dir.exists()) {
				dir.mkdirs();
			}
			
			String destFilename = copyDir + File.separator + sourceFilename;
			
			in = new FileInputStream(sourceFilename);
			out = new FileOutputStream(destFilename);
			
			int singleByte = in.read();
			
			
			while (singleByte != -1) {
				System.out.print((char)singleByte + " ");
				out.write(singleByte);
				singleByte = in.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();					
				}
				
				if (out != null) {
					out.close();					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}