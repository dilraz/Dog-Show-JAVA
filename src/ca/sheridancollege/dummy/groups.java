package ca.sheridancollege.dummy;

public enum groups {
	 Sporting_Dogs, Hounds,Working_Dogs,Terriers,Toys,Non_Sporting,Herding;
	
	public static groups getRandom(){
		groups lettre = groups.values()[(int)(Math.random()*groups.values().length)];
		
		return lettre;
	    }
	public static String toString(groups b) {
		  String group = b.toString();
		  group = group.replace("_", " ");
		  return group;
	  }
}
