package ca.sheridancollege.servlets;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.dummy.*;
import ca.sheridancollege.dao.DAO;

/**
 * Servlet implementation class ShowList
 */
@WebServlet("/ShowList")
public class ShowList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DAO d1 =new DAO();
		ArrayList<String> list = new ArrayList<String>();
		breeds[] breed = breeds.values();
		for(int i=0;i<breed.length;i++) {
	String listy =d1.getBreedNum(breeds.toString(breeds.values()[i])) + " " + (breeds.toString(breeds.values()[i]))+" " +d1.getMaleClassDogs((breeds.toString(breeds.values()[i])))  + "-" +d1.getFemaleClassDogs((breeds.toString(breeds.values()[i]))) + "-" +d1.getMaleSpecialityDogs((breeds.toString(breeds.values()[i])))
	 + "-" +d1.getFemaleSpecialityDogs((breeds.toString(breeds.values()[i]))) ;
	list.add(listy);
		}
		request.setAttribute("list", list);
		request.getRequestDispatcher("showList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */


}
