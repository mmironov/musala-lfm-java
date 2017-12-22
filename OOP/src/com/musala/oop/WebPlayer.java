package com.musala.oop;

public class WebPlayer implements Player {
	
	@Override
	public String sourceUrl() {
		return "https://video.com/video1";
	}

	@Override
	public void start() {
		System.out.println("Starting web player.");
	}

	@Override
	public void resume() {
		System.out.println("Resuming web player.");
	}

	@Override
	public void pause() {
		System.out.println("Pausing web player.");
	}

	@Override
	public void stop() {
		System.out.println("Stopping web player.");
	}

	@Override
	public void jumpTo(int second) {
		System.out.println("Jumping to " + second + " seconds from start.");
	}
}