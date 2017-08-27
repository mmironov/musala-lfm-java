package com.musala.lfm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterApp {

	private static final int MIN_PASSWORD_LENGTH = 6;
	protected static final Color COLOR_RED = new Color(228, 119, 119);
	protected static final Color COLOR_YELLOW = new Color(250, 236, 142);
	protected static final Color COLOR_GREEN = new Color(193, 251, 157);

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
		
		JLabel lblPasswordsMatchingInfo = new JLabel("Passwords do not match");
		mainPanel.add(lblPasswordsMatchingInfo);
		lblPasswordsMatchingInfo.setVisible(false);
		lblPasswordsMatchingInfo.setForeground(COLOR_RED);
		
		final JButton signUpButton = new JButton("Sign Up");
		signUpButton.setEnabled(false);
		
		signUpButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String[] options = {"Йей!"};
				
				String message = "Честито, " + txtUsername.getText() + "!";
				String title = "Евала!";
				Icon icon = new ImageIcon("ic_smile.png");
				int option = JOptionPane.showOptionDialog(mainPanel, message, title, JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, options[0]);
				
				frame.dispose();
			}
		});
		
		mainPanel.add(signUpButton);
		
		txtUsername.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				if (e.isActionKey()) {
					return;				
				}
				
				System.out.println("username changed (" + txtUsername.getText() + ")");
				
				boolean isFormValid = isFormValid(txtUsername.getText(), 
						txtPassword.getPassword(), txtConfirmPassword.getPassword());
				signUpButton.setEnabled(isFormValid);
			}
		});
		
		txtPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				if (e.isActionKey()) {
					return;				
				}
				
				System.out.println("password changed (" + Arrays.toString(txtPassword.getPassword()) + ")");
				
				boolean isFormValid = isFormValid(txtUsername.getText(), 
						txtPassword.getPassword(), txtConfirmPassword.getPassword());
				signUpButton.setEnabled(isFormValid);
				
				if (txtPassword.getPassword() == null || 
						txtPassword.getPassword().length == 0) {
					txtPassword.setBackground(Color.WHITE);
					return;
				}
				
				PasswordType type = getPasswordType(txtPassword.getPassword());
				
				switch (type) {
				case INVALID:
					txtPassword.setBackground(COLOR_RED);
					break;
				case WEAK:
					txtPassword.setBackground(COLOR_YELLOW);
					break;
				case STRONG:
					txtPassword.setBackground(COLOR_GREEN);
					break;
				}
			}
		});
		
		txtConfirmPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				if (e.isActionKey()) {
					return;				
				}
				
				System.out.println("confirmed changed (" + Arrays.toString(txtConfirmPassword.getPassword()) + ")");
				
				boolean isFormValid = isFormValid(txtUsername.getText(), 
						txtPassword.getPassword(), txtConfirmPassword.getPassword());
				signUpButton.setEnabled(isFormValid);
				
				if (txtConfirmPassword.getPassword() == null || 
						txtConfirmPassword.getPassword().length == 0) {
					txtConfirmPassword.setBackground(Color.WHITE);
					return;
				}
				
				if (getPasswordType(txtPassword.getPassword()) != PasswordType.INVALID) {
					boolean matching = arePasswordsMatching(txtPassword.getPassword(), 
							txtConfirmPassword.getPassword());
					lblPasswordsMatchingInfo.setVisible(!matching);
				}
			}
		});
		
		frame.add(mainPanel);
		frame.setVisible(true);
	}
	
	protected static PasswordType getPasswordType(char[] password) {
		
		if (password == null || password.length < MIN_PASSWORD_LENGTH) {
			return PasswordType.INVALID;
		}
		
		boolean alphaFound = false;
		boolean digitFound = false;
		
		for(int i=0; i  < password.length; ++i) {
			
			if (Character.isDigit(password[i])) {
				digitFound = true;
			}
			
			if (Character.isLetter(password[i])) {
				alphaFound = true;
			}
			
			if (alphaFound && digitFound) {
				return PasswordType.STRONG;
			}
		}
		
		return PasswordType.WEAK;
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
