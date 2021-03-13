package com.mvc.util;

import java.sql.DriverManager;
import java.sql.Connection;

public class dbConnection {
	 public static Connection createConnection()
	 {
	     Connection con = null;
	     String url = "jdbc:mysql://localhost:3306/employeedb";
	     String username = "root";
	     String password = "";
	     System.out.println("In DBConnection.java class ");
	      
	     try
	     {
	         try
	         {
	            Class.forName("com.mysql.jdbc.Driver");
	         } 
	         catch (ClassNotFoundException e)
	         {
	            e.printStackTrace();
	         }       
	         con = (Connection) DriverManager.getConnection(url, username, password);
	         System.out.println("Printing connection object " + con);
	     } 
	     catch (Exception e) 
	     {
	        e.printStackTrace();
	     }   
	     return con; 
	 }
}
