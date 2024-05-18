package com.cvtheque.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class addExperience extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addExperience frame = new addExperience();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addExperience() {
		
		setBounds(100, 100, 810, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Prevent default closing operation
		this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
            	 dispose();
            }
        });
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ajouter une expérience");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(40, 30, 269, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Intitulé de l'expérience");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(40, 111, 189, 24);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(225, 115, 300, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Intitulé de l'expérience");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(40, 166, 189, 24);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(225, 170, 300, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Intitulé de l'expérience");
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(40, 218, 189, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(225, 222, 300, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Intitulé de l'expérience");
		lblNewLabel_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(40, 275, 189, 24);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(225, 279, 300, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Intitulé de l'expérience");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(40, 344, 189, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(225, 346, 300, 52);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton.setBounds(472, 476, 125, 35);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnReset.setBounds(314, 476, 125, 35);
		contentPane.add(btnReset);
	}

}
