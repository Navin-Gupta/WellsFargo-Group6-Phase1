package com.wf.triaining.jdbc.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			// Load the DB Driver (class) : Load a class
			Class.forName("com.mysql.jdbc.Driver");
			// Set up connection
			// DriverManager.getConnection("<url>","<username>","<password>")
			Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost/employeedb","root","");
			// by default an open connection
			// Create a statement
			// Statement stmt = connection.createStatement();
			
			// Customize the ResultSet behavior
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
														ResultSet.CONCUR_UPDATABLE);
			
			
			
			// Setting up batch (insert/delete/update)
			stmt.addBatch("");  // not execute
			stmt.addBatch("");
			stmt.addBatch("");
			stmt.addBatch("");
			
			int arr[] = stmt.executeBatch(); // run all queries
			
			stmt.clearBatch();
			
			stmt.addBatch("");
			
			
			// Transaction Block 
			try {
				// set the auto commit off
				connection.setAutoCommit(false);
				stmt.executeUpdate("");
				stmt.executeUpdate("");
				stmt.executeUpdate("");
				stmt.executeUpdate("");
				stmt.executeUpdate("");
				stmt.executeUpdate("");
				
				// commit all changes to actual tables
				connection.commit();
			}catch(Exception ex) {
				// rollback the effect
				connection.rollback();
			}finally {
				connection.setAutoCommit(true);
			}
			
			
			
			
			
			
			// PreparedStatement : Predefined Query Template
			// Preferred approach
			PreparedStatement pstmt =  connection
					.prepareStatement("insert into employee (empname,email,age) values(?,?,?)");
			
			// no dialect conflict
			// embedding dynamic data with raw query
			// binary data handling is easier
			// eliminate the possibility of SQL INJECTIONS also
			
			
			
			// put the values in placeholders
			pstmt.setString(1, "");
			pstmt.setString(2, "");
			pstmt.setInt(3, 23);
			
			pstmt.executeUpdate();
			
			
			
			
			// fire the query : through statement
			ResultSet rs =  stmt.executeQuery("select * from employee"); // select
			
			// scroll sensitive nature (navigation)
			// all method return boolean value 
			rs.next();
			rs.previous();
			rs.first();
			rs.last();
			rs.beforeFirst();
			rs.afterLast();
			rs.relative(2);
			rs.relative(-2);
			rs.absolute(3); // 0 based index
			
			// Concurrent Updatable
			
			// Update a record
			
			// Active record
			// by default changes are done in views
			rs.updateString(2, "");
			rs.updateString(3, "");
			rs.updateRow(); // commit the changes to actual table
			rs.refreshRow(); // to refresh the RS
			
			// delete a record
			
			// Active Record
			rs.deleteRow();
			rs.refreshRow(); 
			
			// Insert new record
			
			// Cursor can be at any location
			rs.insertRow(); // adds a blank rows (views)
			rs.moveToInsertRow();
			rs.updateString(2, "");
			rs.updateString(3, "");
			rs.updateRow(); // commit the changes to actual table
			rs.refreshRow(); // to refresh the RS
			rs.moveToCurrentRow(); // cursor will get back to its prev/original location
			
			
			
			
			
			
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + 
									" | " + rs.getString(2) + 
									" | " + rs.getString(3) + 
									" | " + rs.getInt(4));
			}
			
			// need to move record pointer
			/*if(rs.next()) {
				// fetch the record
				String name = rs.getString("empname");
				String data = rs.getString(1); // 1 based indexing
				
			}
			while(rs.next()) {
				
			}*/
			
			
			
			// int n = stmt.executeUpdate(""); // update, delete, insert
			// n : number of rows affected
			rs.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
