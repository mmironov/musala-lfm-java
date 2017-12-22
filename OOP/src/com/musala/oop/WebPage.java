package com.musala.oop;

public class WebPage {

	private Player player;
	
	public void onPageStarted() {
		
		if (getUserAgent().equals("Android")) {
			player = new NativePlayer();
		} else {
			player = new WebPlayer();
		}
	}
	
	public void onPageFinished() {
		player.start();
	}
	
	public void onPagePaused() {
		player.pause();
	}
	
	public void onPageResumed() {
		player.resume();
	}
	
	public void onPageDestroyed() {
		player.stop();
	}
	
	private String getUserAgent() {
		return "Android";
	}
}