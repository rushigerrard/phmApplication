package com.phm.application.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	static final String jdbcURL 
	= "jdbc:oracle:thin:@orca.csc.ncsu.edu:1521:orcl01";
	
    Connection conn = null;
	public Connection dbConnection(){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "rsghatpa";	// For example, "jsmith"
			String passwd = "200110821";	// Your 9 digit student ID number
			
			
			// Get a connection from the first driver in the
			// DriverManager list that recognizes the URL jdbcURL
				
			conn = DriverManager.getConnection(jdbcURL, user, passwd);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //Log it, don't throw stack trace
			
		}
		return conn;
		
	}

	
}
/*
 * try {
		
		// Load the driver. This creates an instance of the driver
		// and calls the registerDriver method to make Oracle Thin
		// driver available to clients.
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String user = "rsghatpa";	// For example, "jsmith"
		String passwd = "200110821";	// Your 9 digit student ID number
		
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			// Get a connection from the first driver in the
			// DriverManager list that recognizes the URL jdbcURL
			
			conn = DriverManager.getConnection(jdbcURL, user, passwd);
		return null;

		}

 * */
 