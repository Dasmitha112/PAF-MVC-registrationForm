package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.registerBean;
import com.mvc.dao.registerDAO;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public registerServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		// Copying all the input parameters in to local variables
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String nic = request.getParameter("nic");
		int mobile = Integer.parseInt(request.getParameter("mobile"));
		String password = request.getParameter("password");


		registerBean registerBean = new registerBean();
		// Using Java Beans - An easiest way to play with group of related data
		registerBean.setUserName(userName);
		registerBean.setEmail(email);
		registerBean.setNic(nic);
		registerBean.setMobile(mobile);
		registerBean.setPassword(password);


		registerDAO registerDao = new registerDAO();

		// The core Logic of the Registration application is present here. We are going to insert user data in to the database.
		String userRegistered = registerDao.registerUser(registerBean);


		if (userRegistered.equals("SUCCESS")) 	
			request.getRequestDispatcher("/homePage.jsp").forward(request, response);
		else {
			request.setAttribute("errMessage", userRegistered);
			request.getRequestDispatcher("/registrationPage.jsp").forward(request, response);
		}
	}

}
