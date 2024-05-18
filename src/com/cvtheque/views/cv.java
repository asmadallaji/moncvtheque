package com.cvtheque.views;

import java.awt.EventQueue;



import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import com.cvtheque.controller.candidatController;
import com.cvtheque.controller.competenceController;
import com.cvtheque.controller.experienceController;
import com.cvtheque.controller.formationController;


public class cv extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private addCandidat addCandidat;
	private addCompetence addCompetence;
	private addExperience addExperience;
	private addFormation addFormation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cv frame = new cv();
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
	public cv() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		String[] headerCandidat = { "Nom", "Prénom", "Email", "Téléphone", "Adresse", "Actions"};
		String[][] recCandidat = {
		         { "1", "Dallaji", "Asma", "asma.dallaji@gmail.com", "58545335", "bardo","" },
		      };
		String[] headerFormation = { "Intitulé", "Année de debut", "Année de fin", "etablissement", "Actions"};
		 	
		 	String[][] recFormation = {
			         { "1", "Ingerieur", "2023", "2025", "Polytech",""},
			      };
		 	 String[] headerCompetence = {"1", "Titre", "Niveau", "Actions"};
		      String[][] recCompetance = {
				         { "1", "php", "debutant", ""},
				      };
			     
		      JTable table = new JTable(recCandidat, headerCandidat);
		      TableColumnModel test = table.getColumnModel();
		      //test.getColumn(0).setCellRenderer(new CenteredCellRenderer());
		      JTable table2 = new JTable(recFormation, headerFormation);
		      JTable table3 = new JTable(recCompetance, headerCompetence);
		      contentPane.setLayout(null);
		      JScrollPane scrollPane = new JScrollPane(table);
		      scrollPane.setBounds(10, 179, 778, 91);
		      contentPane.add(scrollPane);
		      JScrollPane scrollPane_1 = new JScrollPane(table2);
		      scrollPane_1.setBounds(10, 309, 791, 105);
		      contentPane.add(scrollPane_1);
		      
		     
		      
		      JScrollPane scrollPane_1_1 = new JScrollPane(table3);
		      scrollPane_1_1.setBounds(10, 458, 791, 91);
		      contentPane.add(scrollPane_1_1);
		      setContentPane(contentPane);
		      
		      JLabel lblNewLabel = new JLabel("Candidat");
		      lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		      lblNewLabel.setBounds(10, 146, 168, 22);
		      contentPane.add(lblNewLabel);
		      
		      JLabel lblFormations = new JLabel("Formations");
		      lblFormations.setFont(new Font("Verdana", Font.PLAIN, 14));
		      lblFormations.setBounds(10, 276, 168, 22);
		      contentPane.add(lblFormations);
		      
		      JLabel lblCompetencess = new JLabel("Competences");
		      lblCompetencess.setFont(new Font("Verdana", Font.PLAIN, 14));
		      lblCompetencess.setBounds(10, 425, 168, 22);
		      contentPane.add(lblCompetencess);
		      
		      JPanel panel = new JPanel();
		      panel.setBounds(10, 11, 791, 120);
		      contentPane.add(panel);
		      panel.setLayout(null);
		      
		      JButton btnAddCandidat = new JButton("Ajouter un candidat");
		      btnAddCandidat.setBounds(24, 11, 172, 23);
		      btnAddCandidat.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	addCandidat = new addCandidat();
		            	addCandidat.setVisible(true);
		            }
		        });
		      //btnAddCandidat.addActionListener(new candidatController());
		      panel.add(btnAddCandidat);
		      
		      JButton btnAjouterUneFormation = new JButton("Ajouter une formation");
		      btnAjouterUneFormation.setBounds(24, 59, 172, 23);
		      //btnAjouterUneFormation.addActionListener(new formationController());
		      btnAjouterUneFormation.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	addFormation = new addFormation();
		            	addFormation.setVisible(true);
		            }
		        });
		      panel.add(btnAjouterUneFormation);
		      
		      JButton btnAjouterUneComptence = new JButton("Ajouter une compétence");
		      btnAjouterUneComptence.setBounds(232, 11, 189, 23);
		      btnAjouterUneComptence.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	addCompetence = new addCompetence();
		            	addCompetence.setVisible(true);
		            }
		        });
		      panel.add(btnAjouterUneComptence);
		      
		      JButton btnAddExperience = new JButton("Ajouter une expérience");
		      btnAddExperience.setBounds(232, 59, 189, 23);
		      //btnAddExperience.addActionListener(new experienceController());
		      btnAddExperience.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		            	addExperience = new addExperience();
		            	addExperience.setVisible(true);
		            }
		        });
		      panel.add(btnAddExperience);
		      
		      btnAjouterUneFormation.addActionListener(this);
		      btnAjouterUneComptence.addActionListener(this);
		      btnAddCandidat.addActionListener(this);
		      btnAddExperience.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
