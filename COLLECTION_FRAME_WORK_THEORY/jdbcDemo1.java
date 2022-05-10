package org.jspider.jdbcApp;

import java.sql.*;

public class jdbcDemo1 
{
public static void main(String[] args) {
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver class loaded & Registred.");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
		System.out.println("Connection established with database Server.");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		
	}
	finally {
		if(con!=null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Closed all costly Resources.");
	}
	
}
}
