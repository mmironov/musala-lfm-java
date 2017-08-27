package com.musala.lfm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutManagersDemo {

	public static void main(String[] args) {
		
//		flowLayoutDemo();
//		borderLayoutDemo();
//		gridLayoutDemo();
//		boxLayoutDemo();
		noLayoutDemo();
	}
	
	private static void flowLayoutDemo() {
		JFrame frame = new JFrame("Sign Up");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 20));
		
		JButton button1 = new JButton("Bu");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);
		
		frame.add(mainPanel);
		frame.setVisible(true);
	}
	
	private static void borderLayoutDemo() {
		JFrame frame = new JFrame("Sign Up");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		
		JButton button1 = new JButton("Bu");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		
		JButton button5 = new JButton("Button 5");
		JPanel button5Panel = new JPanel();
		button5Panel.add(button5);
		
		mainPanel.add(BorderLayout.NORTH, button3);
		mainPanel.add(BorderLayout.WEST, button1);
		mainPanel.add(BorderLayout.SOUTH, button2);
		mainPanel.add(BorderLayout.EAST, button4);
		mainPanel.add(BorderLayout.CENTER, button5Panel);
		
		frame.add(mainPanel);
		frame.setVisible(true);
	}
	
	private static void gridLayoutDemo() {
		JFrame frame = new JFrame("Sign Up");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new GridLayout(3, 3));
		
		JButton button1 = new JButton("Bu");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		JButton button5 = new JButton("Button 5");
		JButton button6 = new JButton("Button 6");
		
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);
		mainPanel.add(button4);
		mainPanel.add(button5);
		mainPanel.add(button6);
		
		frame.add(mainPanel);
		frame.setVisible(true);
	}
	
	private static void boxLayoutDemo() {
		JFrame frame = new JFrame("Sign Up");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		
//		JPanel mainPanel = new JPanel();
//		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		
		Box mainPanel = Box.createVerticalBox();
		
		JButton button1 = new JButton("Bu");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		
		mainPanel.add(button1);
		mainPanel.add(Box.createVerticalStrut(40));
		mainPanel.add(button2);
		mainPanel.add(Box.createVerticalGlue());
		mainPanel.add(button3);
		
		frame.add(mainPanel);
		frame.setVisible(true);
		
		String str = "123";
		
		str = "hello";
	}
	
	private static void noLayoutDemo() {
		JFrame frame = new JFrame("Sign Up");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);
		frame.setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(null);
		
		JButton button1 = new JButton("Bu");
		button1.setBounds(10, 10, 150, 60);
		JButton button2 = new JButton("Button 2");
		button2.setBounds(200, 200, 120, 80);
		JButton button3 = new JButton("Button 3");
		
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);
		
		frame.add(mainPanel);
		frame.setVisible(true);
	}
}
