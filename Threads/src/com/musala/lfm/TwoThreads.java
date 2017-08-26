package com.musala.lfm;

public class TwoThreads {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Thread backgroundThread = new Thread(new BackgroundCode());
		backgroundThread.start();
		
		for(int i=0; i < 100; ++i) {
			
			if (i == 5) {
				backgroundThread.interrupt();
			}
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class BackgroundCode implements Runnable {

	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'Z'; ++ch) {
			System.out.println(ch);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("The thread was interrupted");
			}
		}
	}
}
