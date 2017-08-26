package com.musala.lfm.collections;

public class LfmException extends Exception {
	
	private String studentName;
	
	public LfmException() {
		
	}
	
	public LfmException(String message) {
		super(message);
	}
	
	public LfmException(Throwable cause) {
		super(cause);
	}
	
	public LfmException(String message, Throwable cause) {
		super(message, cause);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}