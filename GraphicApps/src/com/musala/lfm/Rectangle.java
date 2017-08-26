package com.musala.lfm;

public class Rectangle {

	private Point topLeft;
	private int width;
	private int height;
	
	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public int getWidth() {
		return width;
	}
	
	public int area() {
		return width * height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "(" + width + ", " + height + ")";
	}
	
	public static class Point {
		public int x;
		public int y;
	}
}