package com.cvtheque.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class addCandidat extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JLabel lblNewLabel_1_1_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCandidat frame = new addCandidat();
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
	public addCandidat() {
		
		setBounds(100, 100, 750, 500);
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
		
		JLabel lblNewLabel = new JLabel("Nom");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setBounds(40, 89, 88, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(144, 92, 300, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Prénom");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(40, 136, 75, 28);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 143, 300, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(40, 185, 75, 28);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(144, 192, 300, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Téléphone");
		lblNewLabel_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(32, 239, 96, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(144, 246, 300, 20);
		contentPane.add(textField_3);
		
		lblNewLabel_1_1_2 = new JLabel("Adresse");
		lblNewLabel_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(40, 307, 96, 28);
		contentPane.add(lblNewLabel_1_1_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(144, 296, 300, 53);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnNewButton.setBounds(452, 375, 125, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Ajouter un candidat");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(40, 30, 290, 28);
		contentPane.add(lblNewLabel_2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setFont(new Font("Verdana", Font.PLAIN, 16));
		btnReset.setBounds(306, 375, 125, 35);
		contentPane.add(btnReset);
	}
}
