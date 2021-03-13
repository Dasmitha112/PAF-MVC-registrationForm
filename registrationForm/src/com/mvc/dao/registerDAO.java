package com.mvc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import com.mvc.bean.registerBean;
import com.mvc.util.dbConnection;


public class registerDAO {
    public String registerUser(registerBean RegisterBean)
    {
        String userName = RegisterBean.getUserName();
        String email = RegisterBean.getEmail();
        String nic= RegisterBean.getNic();
        int mobile = RegisterBean.getMobile();
        String password = RegisterBean.getPassword();
        
        Connection con = null;
        PreparedStatement preparedStatement = null;         
        try
        {
            con = (Connection) dbConnection.createConnection();
            String query = "insert into employee(username,email,nic,mobile,password) values (?,?,?,?,?)";
            preparedStatement = con.prepareStatement(query);  //Making use of prepared statements here to insert bunch of data
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, nic);
            preparedStatement.setInt(4, mobile);
            preparedStatement.setString(5, password);
            
            int i= preparedStatement.executeUpdate();
            
            if (i!=0)  //Just to ensure data has been inserted into the database
            	return "SUCCESS"; 
        }
        catch(SQLException e)
        {
           e.printStackTrace();
        }       
        return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
    }
}
