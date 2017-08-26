package com.musala.lfm.collections;

public class Box<T> {
	
	private T value;
	
	public Box() {
		value = null;
	}
	
	public Box(T value) {
		this.value = value;
	}
	
	public T get() {
		return value;
	}
	
	public boolean isEmpty() {
		return value == null;
	}
	
	@Override
	public String toString() {
		String result = "<";
		
		if (value != null) {
			result += value.toString();
		}
		
		result += ">";
		
		return result;
	}
}
