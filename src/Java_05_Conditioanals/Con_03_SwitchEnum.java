package Java_05_Conditioanals;

public class Con_03_SwitchEnum {
	
	enum Option { 
		
		BLUE_PILL,
		RED_PILL
		
	}
	
	public static void takeOne(Option option) { 
		
		switch(option) {
		  case BLUE_PILL:
		    System.out.println("Story ends, wake up, believe whatever you want."); 
		    break;
		  case RED_PILL:
		    System.out.println("I show you how deep the rabbit hole goes."); 
		    break;
		} 
		
	}

}
