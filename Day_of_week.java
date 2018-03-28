package assignments;
import java.util.Scanner;

public class Day_of_week {

	//Were are establishing a numerical code match for each day of the
	// week. i.e:  1 = Monday, 2 = Tuesday, and so on...
	
	public static void main(String[] args) {
		Scanner day = new Scanner(System.in);
		System.out.println("Please enter a number between 1-7:");
		int get_day = day.nextInt();
		
		if(get_day == 1) {
			System.out.println("Weekday "+ get_day + " is Monday!");
		}
		else if(get_day == 2) {
			System.out.println("Weekday "+ get_day + " is Tuesday!");
		}
		else if(get_day == 3) {
			System.out.println("Weekday "+ get_day + " is Wednesday!");
		}
		else if(get_day == 4) {
			System.out.println("Weekday "+ get_day + " is Thursday!");
		}
		else if(get_day == 5) {
			System.out.println("Weekday "+ get_day + " is Friday!");
		}
		else if(get_day == 6) {
			System.out.println("Weekday "+ get_day + " is Saturday!");
		}
		else if(get_day == 7){
			System.out.println("Weekday "+ get_day + " is Sunday!");
		}
		else {
			System.out.println("That's not a number between 1-7!");
		}
		
		
		
		
		day.close();
		
	}

}
