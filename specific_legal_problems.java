package assignments;

import java.util.Scanner;

public class specific_legal_problems {

	public static void main(String[] args) {
		
		Scanner give_name = new Scanner(System.in);
		Scanner give_age = new Scanner(System.in);
	
		System.out.println("State your name, citizen!:");
		String name = give_name.nextLine();
		System.out.println("So your name is " + name+ " ...interesting");
	
		System.out.println("Now state your age! :");
		int age = give_age.nextInt();
	
		if(age < 16) {
		System.out.println("You can't drive, " + name + "! Enjoy your bike!");
		}
		else if(age < 18) {
			System.out.println("You can't vote, " + name + "!");
		}
		else if(age < 25) {
			System.out.println("You can't rent a car, " + name + "! :-(" );
		}
		else {
			System.out.println("You can do anything that's legal, " + name + "!");
		}
		
		
		
		give_name.close();
		give_age.close();
		
		
	}

}
