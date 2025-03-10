package ca.sheridancollege.servlets;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.beans.*;
import ca.sheridancollege.dao.DAO;

/**
 * Servlet implementation class GetDogs
 */
@WebServlet("/GetDogs")
public class GetDogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAO d = new DAO();
		ArrayList<Dog> list =d.getDogs();
		request.setAttribute("dogs", list);
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}
	}



