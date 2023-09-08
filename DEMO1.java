package com.jsp.JDBCprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DEMO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306?user=root&password=12345"; 
		 String query="insert into sankar.student values(741, 'sasi','ECE')";
		 
		 try 
		 {
			Connection connect=DriverManager.getConnection(url);
		    Statement stmt=connect.createStatement();
		    int rs=stmt.executeUpdate(query);
		    if (rs>0)
		  	
		    {
			System.out.println("insert.data");	
		 }
		 }
		    
		 catch (SQLException e) 
		 {
			
			e.printStackTrace();
		}

	}

}
