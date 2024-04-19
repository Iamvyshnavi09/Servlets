package in.vaish.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		private Connection connection;
		

		public void init() {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/data", "root", "vvv999");
			} catch (SQLException e) {

				e.printStackTrace();
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
		}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			java.sql.Statement statement = connection.createStatement();
			int rowseffected = statement.executeUpdate("update studentdetails set name ='"+name+"'where password= '"+password+"'");
			 PrintWriter out = response.getWriter();
			 if(rowseffected>0) {
				 out.println("<h1>password is updated</h1>");
			 }
			 else {
				 out.print("<h1> not updated</h1>");
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}


