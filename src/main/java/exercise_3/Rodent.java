package exercise_3;

public class Rodent {
	
	public static void main (String[] args) {
		
		baseClass[] ruru = new baseClass[3];
		
		ruru[0] = new Mouse();
		ruru[1] = new Gebril();
		ruru[2] = new Hamster();
		
		for (baseClass waw : ruru) {
			waw.apperance();
		}
			
	
			
		}
	}



