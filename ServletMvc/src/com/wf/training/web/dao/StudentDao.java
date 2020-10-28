package com.wf.training.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wf.training.web.model.Student;

public class StudentDao {

	// delegate/outsource the details
	private String driver;
	private String url;
	private String username;
	private String password;
	
	private Connection connection;
	
	public StudentDao(String driver, String url, String username, String password) {
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	// set up the connection
	private void connect() throws ClassNotFoundException, SQLException {
		if(this.connection == null || this.connection.isClosed()) {
			Class.forName(driver); // explicilty load a java class in memory
			this.connection = DriverManager.getConnection(url, username, password);
		}
	}
	
	// close the connection
	private void disConnect() throws SQLException {
		if(this.connection != null && !this.connection.isClosed())
			this.connection.close();
	}
	
	public List<Student> getStudentRecords() throws ClassNotFoundException, SQLException {
		String sql = "select * from students";
		this.connect();
		
		Statement stmt = this.connection.createStatement();
		ResultSet rs =  stmt.executeQuery(sql);
		
		List<Student> students = new ArrayList<Student>();
		
		while(rs.next()) {
			Student student = new Student(rs.getInt(1),
										  rs.getString(2),
										  rs.getString(3),
										  rs.getString(4));
			students.add(student);
		}
		
		rs.close();
		stmt.close();
		this.disConnect();
		return students;
	}
	
	public boolean addStudentRecord (Student student) throws ClassNotFoundException, SQLException {
		String sql = "insert into student (name, email, contact) values(?,?,?)";
		this.connect();
		
		PreparedStatement pstmt = this.connection.prepareStatement(sql);
		
		pstmt.setString(1, student.getName());
		pstmt.setString(2, student.getEmail());
		pstmt.setString(3, student.getContact());
		
		int n = pstmt.executeUpdate();
		
		pstmt.close();
		this.disConnect();
		
		if(n>0)
			return true;
		return false;
	}
}















