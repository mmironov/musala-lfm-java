package com.musala.map;

import java.util.ArrayList;
import java.util.LinkedList;

import com.musala.list.List;

public class HashMap<K, V> implements Map<K, V> {

	private static final int SIZE = 11;
	
	private ArrayList<LinkedList<Pair<K, V>>> table;
	private int size;
	
	public HashMap() {
		table = new ArrayList<>(SIZE);
		
		for(int i=0; i < SIZE; ++i) {
			table.add(null);
		}
		
		size = 0;
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public List<K> keyset() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<V> valueset() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(K key) {
		if (contains(key)) {
			LinkedList<Pair<K,V>> values = table.get(hashIndex(key));
			
			for(Pair<K,V> pair : values) {
				if (pair.key.equals(key)) {
					return pair.value;
				}
			}
		}
		
		return null;
	}

	@Override
	public boolean contains(K key) {
		int index = hashIndex(key);
		
		if (table.get(index) == null || table.get(index).size() == 0) {
			return false;
		}
		
		return true;
	}

	private int hashIndex(K key) {
		int hash = key.hashCode();
		hash = (hash >= 0) ? hash : hash * (-1);
		int index = hash % SIZE;
		return index;
	}
	
	@Override
	public void insert(K key, V value) {
		
		int index = hashIndex(key);
		
		LinkedList<Pair<K, V>> values = table.get(index);
		
		if (values == null) {
			values = new LinkedList<>();
			table.set(index, values);
		}
		
		Pair<K, V> pair = new Pair<>();
		pair.key = key;
		pair.value = value;
		values.add(pair);
		
		++size;
	}
	
	@Override
	public String toString() {
		return table.toString();
	}
	
	public static class Pair<K, V> {
		public K key;
		public V value;
		
		@Override
		public String toString() {
			return String.format("{%s: %s}", key.toString(), value.toString());
		}
	}
}