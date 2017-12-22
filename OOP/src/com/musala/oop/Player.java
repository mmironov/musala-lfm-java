package com.musala.oop;

public interface Player {

	String sourceUrl();
	
	void start();
	void resume();
	void pause();
	void stop();
	void jumpTo(int second);
}