package ca.sheridancollege.logic;

import java.util.ArrayList;

public class IdHandler {
	static ArrayList<Integer> ids = new ArrayList<Integer>();
	 public IdHandler() {
		super();
		// TODO Auto-generated constructor stub
	}
	
public  int generateId() {
		
		int temp =(int) (Math.random()*10000);
		ids.add(temp);
		
			return temp;
		
	}
	
	}

