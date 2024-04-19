package in.vaish.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

@WebServlet("/Userapp")
public class UserApp extends HttpServlet {
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
			int rowseffected = statement.executeUpdate("insert into studentdetails values('"+name+"','"+password+"')");
			 PrintWriter out = response.getWriter();
			 if(rowseffected>0) {
				 out.println("<h1>Student details is created</h1>");
			 }
			 else {
				 out.print("<h1>Student details is not created</h1>");
			 }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void destory() {
		try {
			connection.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
