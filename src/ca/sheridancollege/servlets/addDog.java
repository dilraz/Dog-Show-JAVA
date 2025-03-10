package ca.sheridancollege.servlets;
import ca.sheridancollege.beans.*;
import ca.sheridancollege.dao.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.dummy.breeds;
import ca.sheridancollege.dummy.genders;
import ca.sheridancollege.dummy.groups;
import ca.sheridancollege.dummy.names;
import ca.sheridancollege.dummy.owners;

/**
 * Servlet implementation class addDog
 */
@WebServlet("/add")
public class addDog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name =request.getParameter("name");
		String breed = request.getParameter("breed");
		String group = request.getParameter("group");
		String gender = request.getParameter("gender");
		String owner = request.getParameter("owner");
		String speciality = request.getParameter("type");
		
		Dog d = new Dog();
		d.setId(id);
		d.setName(name);
		d.setBreed(breed);
		d.setGroup(group);
		d.setGender(gender);
		d.setOwnerName(owner);
		d.setSpeciality(speciality);
		DAO d1 = new DAO();
		
		d1.generate(d);
		response.sendRedirect("add.jsp");
		
	}


}
