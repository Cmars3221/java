package assignments;
import java.util.Scanner;

public class Space_weight {

	public static void main(String args[]) {
		
		System.out.println("Were going to calculate your weight based on the most popular planets!\nPlease enter your weight (Make sure to round the weight amount!):");
		
		Scanner weight_check = new Scanner(System.in);
		int weight = weight_check.nextInt();
		System.out.println();
		
		
		System.out.println("Now select a planet...\n"				
				+ "1.(Venus)\n"
				+ "2.(Mars)\n"
				+ "3.(Jupiter)\n"
				+ "4.(Saturn) \n"
				+ "5.(Uranus) \n"
				+ "6.(Neptune) \n"
				+ "Select a planet number between 1-6:"	
				);
		
		Scanner planet_check = new Scanner(System.in);
		       int planet= planet_check.nextInt();
		 
		 	if(planet == 1) {
		 		 System.out.println("Venus! Here's how much you will weigh on Venus: " + (weight * 0.78 ) + "lbs.");
		 	}
		 	else if(planet == 2) {
		 		 System.out.println("You weigh " + (weight * 0.39 ) + "lbs on the Red Planet!");
		 	}
		 	else if(planet == 3) {
		 		 System.out.println("On Jupiter it's: " + (weight * 2.65 ) + "lbs");
		 	}
		 	else if(planet == 4) {
		 		 System.out.println("You might be a ring person. Your weight on Saturn... " + (weight * 1.17 )+(" lbs"));
		 	}
		 	else if(planet == 5) {
		 		 System.out.println(" You would weigh: "  + (weight * 1.05 ) + "lbs on Uranu.s");
		 	}
		 	else if(planet == 6) {
		 		 System.out.println("Far out like Neptune! Your weight is: " + (weight * 1.23 ) + " lbs.");
		 	}
		 	else {
		 		System.out.println("That option is not in this galaxy...");
		 	}
		 
		 weight_check.close();
		 planet_check.close();
		
		 
	}
	
	
}
