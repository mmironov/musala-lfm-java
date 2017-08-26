package com.musala.lfm;

public class Car {

	private String color = "Red";
	
	public class Door {
		
		public String getColor() {
			return Car.this.color;
		}
	}
	
	@Override
	public String toString() {
		return color + " car.";
	}
}
