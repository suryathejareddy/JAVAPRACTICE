package com.cmrapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmrapp.dao.UserMasterDAO;
import com.cmrapp.model.UserMaster;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read all input params
		String username = request.getParameter("username");
		String password =request.getParameter("password");
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String emailId = request.getParameter("emailid");

		//create usermaster object um with supplied inputs
		UserMaster um =new UserMaster(username, password, name, mobile, emailId);
	

		//create usermasterdao object
		UserMasterDAO udao = new UserMasterDAO();
		//Caitrescerusert method, supply um
		int rows = udao.registerUser(um);

		//get rows as response, decide output to show
		RequestDispatcher d= null;
		PrintWriter out = response.getWriter();
		if(rows > 0) {
			d=request.getRequestDispatcher("index.html");
			d.include(request, response);
			out.println("<center><h3><font color='blue'>Successfully registered, please login</font></h3></center>");
		}
		
		else {
			d=request.getRequestDispatcher("register.html");
			d.include(request, response);
			out.println("<center> <h3> <font color='red'>Failed to register, please register age</font></h3></center>");
		}

	}

}
