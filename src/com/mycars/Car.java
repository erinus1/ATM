package com.mycars;

public class Car {
	
	int distance = 0;
	
	public void start() {
		System.out.println("Start...");
	}
	
	public void stop() {
		System.out.println("Stop!");
	}	
	
	public void setDrive (int howLong) {
		distance = howLong * 60;	
	}
	
	public int getDrive () {
		System.out.println("We have been driving: " + distance);

		return distance;
	}
}
	