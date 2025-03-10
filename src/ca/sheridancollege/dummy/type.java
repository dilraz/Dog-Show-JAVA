package ca.sheridancollege.dummy;

public enum type {
	Speciality_Dog,Class_Dog;
	public static type getRandom(){
		type lettre = type.values()[(int)(Math.random()*type.values().length)];
		
		return lettre;
	    }
	public static String toString(type b) {
		  String typ = b.toString();
		  typ = typ.replace("_", " ");
		  return typ;
	  }
}
