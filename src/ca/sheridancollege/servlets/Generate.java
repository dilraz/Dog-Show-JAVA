package ca.sheridancollege.servlets;
import ca.sheridancollege.beans.*;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.sheridancollege.beans.Dog;
import ca.sheridancollege.dao.DAO;
import ca.sheridancollege.dummy.*;
import ca.sheridancollege.logic.*;
/**
 * Servlet implementation class Generate
 */
@WebServlet("/Generate")
public class Generate extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		for(int i=0;i<100;i++) {
		IdHandler h = new IdHandler();
		String id = String.valueOf(h.generateId());
		String name = names.getRandom().toString();
		String breed = breeds.toString(breeds.getRandom()).toString();
		String group = groups.toString(groups.getRandom()).toString();
		String gender = genders.getRandom().toString();
		String owner = owners.toString(owners.getRandom()).toString();
		String speciality =type.toString(type.getRandom()).toString();;
		
		Dog d =new Dog();
		d.setId(id);
		d.setName(name);
		d.setBreed(breed);
		d.setGroup(group);
		d.setGender(gender);
		d.setOwnerName(owner);
		d.setSpeciality(speciality);
		
		DAO d1 =new DAO() ;
		d1.generate(d);
		d1.check(d)  ;
		}
		response.sendRedirect("add.jsp");
		
		}

}
