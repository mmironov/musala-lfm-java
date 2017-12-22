package com.musala.map;

import com.musala.list.List;

public interface Map<K, V> {
	
	int size();
	
	List<K> keyset();
	List<V> valueset();
	
	V get(K key);
	boolean contains(K key);
	
	void insert(K key, V value);
}
