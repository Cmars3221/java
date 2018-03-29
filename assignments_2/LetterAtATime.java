package assignments_2;
import java.util.Scanner;

public class LetterAtATime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = sc.nextLine();
		
		for(int i =0; i<word.length(); i++) {
			System.out.println(i + ":" + "'" +word.charAt(i)+"'" );
		}

		sc.close();
		
		
	}

	
	
}
