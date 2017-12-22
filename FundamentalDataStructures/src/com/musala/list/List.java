package com.musala.list;

public interface List<T> {

	int size();
	
	T get(int index);
	
	void add(T element);
	void insertAt(T element, int index);
	
	void remove(int index);
}
