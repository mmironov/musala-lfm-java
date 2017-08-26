package com.musala.lfm;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterApp {

	private static final int MIN_PASSWORD_LENGTH = 6;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Sign Up");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 250);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel();
		
		JLabel lblUsername = new JLabel("Username");
		mainPanel.add(lblUsername);
		
		JTextField txtUsername = new JTextField(20);
		mainPanel.add(txtUsername);
		
		JLabel lblPassword = new JLabel("Password");
		mainPanel.add(lblPassword);
		
		JPasswordField txtPassword = new JPasswordField(20);
		mainPanel.add(txtPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		mainPanel.add(lblConfirmPassword);
		
		JPasswordField txtConfirmPassword = new JPasswordField(20);
		mainPanel.add(txtConfirmPassword);
		
		final JButton signUpButton = new JButton("Sign Up");
		signUpButton.setEnabled(false);
		mainPanel.add(signUpButton);
		
		txtUsername.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("username changed (" + txtUsername.getText() + ")");
				
				boolean isFormValid = isFormValid(txtUsername.getText(), 
						txtPassword.getPassword(), txtConfirmPassword.getPassword());
				signUpButton.setEnabled(isFormValid);
			}
		});
		
		txtPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("password changed (" + Arrays.toString(txtPassword.getPassword()) + ")");
				
				boolean isFormValid = isFormValid(txtUsername.getText(), 
						txtPassword.getPassword(), txtConfirmPassword.getPassword());
				signUpButton.setEnabled(isFormValid);
			}
		});
		
		txtConfirmPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("confirmed changed (" + Arrays.toString(txtConfirmPassword.getPassword()) + ")");
				
				boolean isFormValid = isFormValid(txtUsername.getText(), 
						txtPassword.getPassword(), txtConfirmPassword.getPassword());
				signUpButton.setEnabled(isFormValid);
			}
		});
		
		frame.add(mainPanel);
		frame.setVisible(true);
	}
	
	private static boolean isFormValid(String username, char[] password, char[] retypedPassword) {
		
		boolean isUsernameValid = isUsernameValid(username);
		boolean isPasswordValid = isPasswordValid(password);
		boolean arePasswordsMatching = arePasswordsMatching(password, retypedPassword);
		
		return isUsernameValid && isPasswordValid && arePasswordsMatching;
	}

	private static boolean arePasswordsMatching(char[] password,
			char[] retypedPassword) {
		return Arrays.equals(password, retypedPassword);
	}

	private static boolean isPasswordValid(char[] password) {
		return password != null && password.length >= MIN_PASSWORD_LENGTH;
	}

	private static boolean isUsernameValid(String username) {
		return username != null && !username.trim().isEmpty();
	}
}
