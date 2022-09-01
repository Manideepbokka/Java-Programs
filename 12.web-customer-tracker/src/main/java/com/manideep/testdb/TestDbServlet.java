package com.manideep.testdb;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user="springstudent";
		String pass="springstudent";
		String url="jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		
		String driver="com.mysql.cj.jdbc.Driver";
		
		try
		{
			PrintWriter out=response.getWriter();
			
			out.println("Connecting to database: "+url);
			
			Class.forName(driver);
			
			Connection con=DriverManager.getConnection(url,user,pass);
			
			out.println("SUCCESS!!!");
			
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
