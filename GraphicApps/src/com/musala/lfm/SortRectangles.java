package com.musala.lfm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortRectangles {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		r1.setWidth(20);
		r1.setHeight(40);

		Rectangle r2 = new Rectangle();
		r2.setWidth(200);
		r2.setHeight(409);

		Rectangle r3 = new Rectangle();
		r3.setWidth(100);
		r3.setHeight(100);

		List<Rectangle> rects = new ArrayList<>();
		rects.add(r1);
		rects.add(r2);
		rects.add(r3);
		rects.add(r3);
		rects.add(r3);
		rects.add(r3);

		String message = ":) ";
		
		Comparator comparator = new Comparator<Rectangle>() {

			@Override
			public int compare(Rectangle r1, Rectangle r2) {
				System.out.print(message);
				return r1.area() - r2.area();
			}
		};
		
		rects.sort(comparator);
		
		System.out.println(rects);
	}
}
