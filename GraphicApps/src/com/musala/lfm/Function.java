package com.musala.lfm;

public interface Function {

	int eval(int x);
	boolean equals(Object o);
}

class NewObj implements Function {

	@Override
	public int eval(int x) {
		return 0;
	}
}