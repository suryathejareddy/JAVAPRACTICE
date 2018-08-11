package com.cmrapp.dao;
import java.sql.*;

import com.cmrapp.factory.ConnectionFactory;
import com.cmrapp.model.UserMaster;
public class UserMasterDAO {
    Connection con=null;
    Statement stmt=null;
    public int registerUser(UserMaster um) {
    	int rows=0;
    	
    	String sql="insert into usermaster(username,password,name,mobile,emailid) values('"+um.getUserName()+"','"+um.getPassword()+"','"+um.getName()+"','"+um.getMobile()+"','"+um.getEmailid()+"')";
		try {
			con=ConnectionFactory.getConnection(um);
			stmt=con.createStatement();
			rows=stmt.executeUpdate(sql);
		}catch(Exception e) {
			System.out.println(e);
		}
    	return rows;
    	
    }
}
