package com.niit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.dao.LoginDao;
import com.niit.dao.LoginDaoImpl;
import com.niit.models.Student;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName="",password="";
		try {
			userName = request.getParameter("uName");
			password = request.getParameter("pwd");
			LoginDao loginDao = new LoginDaoImpl();
			Student student = loginDao.validUser(userName,password);
			if(student != null)
			{
				request.setAttribute("student", student);
				RequestDispatcher rd = request.getRequestDispatcher("Header.jsp");
				rd.forward(request, response);
			}
			else 
			{
				RequestDispatcher rd = request.getRequestDispatcher("loginError.jsp");
				rd.forward(request, response);
			}
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
			
	}

	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	//}

}
