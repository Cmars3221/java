package assignments_3;
import java.util.Scanner;

public class CommaSeparatedValues {

	public static void main(String[] args) {
//asking for user input, getting the user input.
		Scanner wordsplit = new Scanner(System.in);
		System.out.println("Enter your words separated by commas ',' :");
		String split = wordsplit.nextLine();
		
		//using the string method,split, allows us to work with it's regex feature to 
		//disseminate the string via the ','
		
		String[] yah = split.split(",");
		for(String blah : yah) {

			System.out.print(blah + " ");
		}
		
		wordsplit.close();
	}

}















//Ask for user input.

// <- use Scanner

//Place those words into a string array. 
  // blah += " "?? then print blah...??

// convert the coagulated string to an array somehow..
 // <-- is there a string method like [split] in python or JS
  // can we single out the ','?

//print out the string array for the user.
 // <--for each loop can parse through arrays/d.structures...


//Your,lazy,dog,got,jumped,by,the,fox,now,he's,at,the,vet
//     ---should turn into--: 
//Your lazy dog got jumped by the fox now he's at the vet 