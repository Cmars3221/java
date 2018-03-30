package assignments_3;
import java.util.Scanner;

public class HowManyTimes {

	public static void main(String[] args) {
		int array1[] = {3,444,16,9,12,9,18,21,444,99};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats the value you're looking for?");
		 int ask = sc.nextInt();
		 
		 int counter = 0;
		 
		 for(int blah : array1) {
			 if(blah==ask){
				counter++;
			 }
			
		 }
		 System.out.println( "That value appears "+ counter +" time(s)." );
		
		 
		 sc.close();
	}

}
