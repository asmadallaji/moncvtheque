package com.cvtheque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	
	String url = "jdbc:mysql://localhost:3306/OCA?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static Connection connect;
	String user="root";
	String password="";
	
	public Connexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				connect= DriverManager.getConnection(url, user, password);
				System.out.println("connexion avec success!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getInstance(){
		if(connect == null) {
			new Connexion();
		}
		
		return connect;
	}
	
	public static void fermer()
	{
		if (connect != null)
		{
			try {
				connect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
