package in.vyshu.average.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.vyshu.controller.Averagecalculator;

/**
 * Servlet implementation class Averagecontroller
 */
@WebServlet("/test")
public class Averagecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("java"));
		int num2 = Integer.parseInt(request.getParameter("jdbc"));
		int num3 = Integer.parseInt(request.getParameter("servlets"));
		int num4 = Integer.parseInt(request.getParameter("jsp"));

		Averagecalculator model = new Averagecalculator();
		int result = model.calculate(num1, num2, num3, num4);
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
		
		rd.forward(request, response);
		
		
		

	}

}
