package com.phm.application.object;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.phm.application.connection.DbConnection;

public class Disease {

	private DbConnection dbConnection = new DbConnection();
	private Connection conn = dbConnection.dbConnection();
	
	private Statement stmt = null;
	private ResultSet rs = null;

	public void createTable(){
		
	}
}
