package com.musala.lfm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PanelsAndFrames {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Window");
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int choice = JOptionPane.showConfirmDialog(frame,
			            "Are you sure you want to close this window?", "Really Closing?", 
			            JOptionPane.YES_NO_OPTION,
			            JOptionPane.QUESTION_MESSAGE);
				if (choice == JOptionPane.YES_OPTION){
			            System.exit(0);
			        }
			}
		});
		
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frame.setSize(700, 500);
		frame.setLocationRelativeTo(null);
		
//		frame.setAlwaysOnTop(true);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JLabel label = new JLabel("Title");
		JButton button = new JButton("Clear");
		JTextField textField = new JTextField(20);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				System.out.println("Button click!!");
			}
		});
		
		panel.add(label);
		panel.add(button);
		panel.add(textField);
		panel.add(new JLabel(new ImageIcon("taj-mahal.jpg")));
		
		JColorChooser chooser = new JColorChooser();
		chooser.getSelectionModel().addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println(chooser.getColor());
				panel.setBackground(chooser.getColor());
			}
		});
		panel.add(chooser);
		
		frame.setVisible(true);
		
//		for(int i=0; i < 100; ++i) {			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.print(i + " " + Thread.currentThread().getName() + " ");
//		}
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(screenSize);
	}
}