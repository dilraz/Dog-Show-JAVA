package ca.sheridancollege.beans;
import java.util.ArrayList;
import ca.sheridancollege.dummy.*;
import ca.sheridancollege.logic.*;
public class Dog {

	
	 
	private String id;
	private String name;
	private String ownerName;
	private String breed;
	private String group;
	private String gender;
	private String speciality;
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String id, String name, String ownerName, String breed, String group, String gender, String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.breed = breed;
		this.group = group;
		this.gender = gender;
		this.speciality = speciality;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	

}
