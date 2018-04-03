package assignment_5;
import java.util.Scanner;
import java.util.*;

public class Pythagorean {
	
	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two sides");
			int side1 = sc.nextInt();
			int side2 = sc.nextInt();;

			int answer = twosides(side1, side2);
			
			System.out.println(answer);
	    	     
			
		sc.close();
}

		
 public static  int twosides(int side1, int side2) {

     int total = (int) (Math.sqrt(Math.pow(side1, 2)+ Math.pow(side2, 2)));

		return total;

 		}
 
 
 

}