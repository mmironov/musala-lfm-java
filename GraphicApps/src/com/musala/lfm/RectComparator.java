package com.musala.lfm;

import java.util.Comparator;

public class RectComparator implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle r1, Rectangle r2) {
		
		return r1.area() - r2.area();
	}	
}
