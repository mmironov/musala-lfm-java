package com.musala.lfm;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		
		Icon icon = new ImageIcon("ic_smile.png");
//		
//		JOptionPane.showMessageDialog(null, "Hello world!", "Info",JOptionPane.WARNING_MESSAGE, icon);
//		
//		String number = JOptionPane.showInputDialog(null, "Enter a number");
//		
//		Integer intNumber = Integer.valueOf(number);
//		
//		JOptionPane.showMessageDialog(null, intNumber);
		
		int choice = JOptionPane.showConfirmDialog(null, "Do you agree?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
		
		switch (choice) {
		case JOptionPane.OK_OPTION:
			JOptionPane.showMessageDialog(null, "Perfect!");
			break;
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Think again!");
			break;
		}
		
		String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		
		int selected = JOptionPane.showOptionDialog(null, "What is this?", ":)", JOptionPane.YES_NO_OPTION, 
				JOptionPane.ERROR_MESSAGE, icon, days, days[1]);
		
		JOptionPane.showMessageDialog(null, days[selected]);
	}
}
