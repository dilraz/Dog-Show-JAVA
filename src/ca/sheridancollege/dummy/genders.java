package ca.sheridancollege.dummy;

public enum genders {
Male,Female;
	public static genders getRandom(){
		genders lettre = genders.values()[(int)(Math.random()*genders.values().length)];
		
		return lettre;
	    }
}
