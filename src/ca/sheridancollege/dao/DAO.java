package ca.sheridancollege.dao;
import ca.sheridancollege.beans.*;
import ca.sheridancollege.logic.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {

	public static void create(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root"); 
			PreparedStatement st =con.prepareStatement("CREATE DATABASE IF NOT EXISTS dogshow");
			st.executeUpdate();
			PreparedStatement st1 =con.prepareStatement("USE dogshow");
			st1.executeUpdate();
			PreparedStatement st2 =con.prepareStatement("CREATE TABLE IF NOT EXISTS dogs(Id int(4),DogName varchar(255),DogBreed varchar(255),DogGroup varchar(255), DogGender varchar(255), OwnerName varchar(255), DogSpeciality varchar(255), PRIMARY KEY(Id))");
		st2.executeUpdate();
		System.out.println("DOne!");
		}catch(Exception e) {System.out.println(e);}
		finally {
		}
		
		
	}
	public static void generate(Dog d){
		try {
				
			
			String id = d.getId();
			String name = d.getName();
			String breed = d.getBreed();
			String group = d.getGroup();
			String gender = d.getGender();
			String owner = d.getOwnerName();
			String speciality = d.getSpeciality();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root"); 
			PreparedStatement st =con.prepareStatement("CREATE DATABASE IF NOT EXISTS dogshow");
			st.executeUpdate();
			PreparedStatement st1 =con.prepareStatement("USE dogshow");
			st1.executeUpdate();
			PreparedStatement st2 =con.prepareStatement("CREATE TABLE IF NOT EXISTS dogs(Id int(4),DogName varchar(255),DogBreed varchar(255),DogGroup varchar(255), DogGender varchar(255), OwnerName varchar(255), DogSpeciality varchar(255), PRIMARY KEY(Id))");
		st2.executeUpdate();
		
		PreparedStatement st3 =con.prepareStatement("INSERT INTO dogs(Id,DogName,DogBreed,DogGroup, DogGender, OwnerName, DogSpeciality) VALUES('"+id+"','"+name+"','"+breed+"','"+group+"','"+gender+"','"+owner+"','"+speciality+"')");
	st3.executeUpdate();
		}catch(Exception e) {System.out.println(e);}
		
	}
	public  ArrayList<Dog> getDogs() {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
			
			try {
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root");
				PreparedStatement st1 =con.prepareStatement("USE dogshow");
				st1.executeUpdate();
			
			
			PreparedStatement s =con.prepareStatement("SELECT * FROM dogs");
			ResultSet rs = s.executeQuery();
			
			while(rs.next()) {
				Dog c =new Dog();
				c.setId(rs.getString(1));
				c.setName(rs.getString(2));
				c.setBreed(rs.getString(3));
				c.setGroup(rs.getString(4));
				c.setGender(rs.getString(5));
				c.setOwnerName(rs.getString(6));
				c.setSpeciality(rs.getString(7));
				dogs.add(c);
				
			}
			return dogs;
			}catch (Exception e) {System.out.println(e);}
			return null;
			
			
		}
		
		
	
	public static void check(Dog j) {
		try {
			String i = j.getId();
			
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root");
		PreparedStatement st =con.prepareStatement("CREATE DATABASE IF NOT EXISTS dogshow");
		st.executeUpdate();
		PreparedStatement st1 =con.prepareStatement("USE dogshow");
		st1.executeUpdate();
		PreparedStatement st2 =con.prepareStatement("CREATE TABLE IF NOT EXISTS dogs(Id int(4),DogName varchar(255),DogBreed varchar(255),DogGroup varchar(255), DogGender varchar(255), OwnerName varchar(255), DogSpeciality varchar(255), PRIMARY KEY(Id))");
	st2.executeUpdate();
		PreparedStatement s =con.prepareStatement("SELECT Id FROM dogs");
		ResultSet rs = s.executeQuery();
		
		
		while(rs.next()) {
			String i1 =(rs.getString("Id"));
			while (i.equals(i1)){
				IdHandler ii = new IdHandler();
				i=String.valueOf(ii.generateId());
				j.setId(i);
			}
			
		}
		
		}catch(Exception e) {System.out.println(e);}
		
	}
	
	public static ArrayList<String> getBreed(){
		try {
			ArrayList<String> breds = new ArrayList<String>();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root"); 
			PreparedStatement st1 =con.prepareStatement("USE dogshow");
			st1.executeUpdate();
	
		PreparedStatement st =con.prepareStatement("SELECT dogBreed FROM dogs ");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			String ide = rs.getString("dogBreed");
			breds.add(ide);
		}
		return breds;
		
		}catch(Exception e) {System.out.println(e);}
		return null;
		
		
	}
	public static int getBreedNum(String s){
		try {
			ArrayList<String> bred = new ArrayList<String>();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root"); 
			PreparedStatement st1 =con.prepareStatement("USE dogshow");
			st1.executeUpdate();
	
		PreparedStatement st =con.prepareStatement("SELECT * FROM dogs WHERE dogBreed='"+s+"'");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			String ide = rs.getString("id");
			bred.add(ide);
		}
		return bred.size();
		
		}catch(Exception e) {System.out.println(e);}
		return 0;
		
		
	}
	public static int getMaleClassDogs(String s){
		try {
			ArrayList<String> malesClass = new ArrayList<String>();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root"); 
			PreparedStatement st1 =con.prepareStatement("USE dogshow");
			st1.executeUpdate();
	
		PreparedStatement st =con.prepareStatement("SELECT * FROM dogs WHERE dogBreed='"+s+"' AND dogGender='Male' AND dogSpeciality='Class Dog'");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			String ide = rs.getString("id");
			malesClass.add(ide);
		}
		return malesClass.size();
		
		}catch(Exception e) {System.out.println(e);}
	return 0;
		
		
	}public static int getFemaleClassDogs(String s){
		try {
			ArrayList<String> femalesClass = new ArrayList<String>();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root"); 
			PreparedStatement st1 =con.prepareStatement("USE dogshow");
			st1.executeUpdate();
	
		PreparedStatement st =con.prepareStatement("SELECT * FROM dogs WHERE dogBreed='"+s+"' AND dogGender='Female' AND dogSpeciality='Class Dog'");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			String ide = rs.getString("id");
			femalesClass.add(ide);
		}
		return femalesClass.size();
		
		}catch(Exception e) {System.out.println(e);}
	return 0;
		
		
	}
	public static int getMaleSpecialityDogs(String s){
		try {
			ArrayList<String> malesSpecial = new ArrayList<String>();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root"); 
			PreparedStatement st1 =con.prepareStatement("USE dogshow");
			st1.executeUpdate();
	
		PreparedStatement st =con.prepareStatement("SELECT * FROM dogs WHERE dogBreed='"+s+"' AND dogGender='Male' AND dogSpeciality='Speciality Dog'");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			String ide = rs.getString("id");
			malesSpecial.add(ide);
		}
		return malesSpecial.size();
		
		}catch(Exception e) {System.out.println(e);}
	return 0;
		
		
	}	public static int getFemaleSpecialityDogs(String s){
		try {
			ArrayList<String> femalesSpecial = new ArrayList<String>();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root"); 
			PreparedStatement st1 =con.prepareStatement("USE dogshow");
			st1.executeUpdate();
	
		PreparedStatement st =con.prepareStatement("SELECT * FROM dogs WHERE dogBreed='"+s+"' AND dogGender='Female' AND dogSpeciality='Speciality Dog'");
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			String ide = rs.getString("id");
			femalesSpecial.add(ide);
		}
		return femalesSpecial.size();
		
		}catch(Exception e) {System.out.println(e);}
	return 0;
		
		
	}
}
