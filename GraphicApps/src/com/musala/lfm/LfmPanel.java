package com.musala.lfm;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Window;

import javax.swing.JPanel;

public class LfmPanel extends JPanel {
	
	int x = 320;
	int y = 220;
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Dimension dim = getSize();
		int x = dim.width;
		int y = dim.height;
		
		g.drawLine(10,  10, x-60, y-60);
		g.drawString(Thread.currentThread().getName(), x-150, y-40);
//		x += 1;
//		y += 1;
	}
}
