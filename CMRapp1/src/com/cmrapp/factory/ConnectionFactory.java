package com.cmrapp.factory;
import java.sql.*;

import com.cmrapp.model.UserMaster;
public class ConnectionFactory {
	public static String url="jdbc:oracle:thin:@localhost:1521:xe";
    static {
    	try {
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
    public static Connection getConnection(UserMaster um) {
    	Connection con=null;
    	try {
    		con=DriverManager.getConnection(url, "system", "sai");
    		
    	}catch(Exception e) {
    		System.out.println(e);
    	}
		return con;
    	
    }
}
