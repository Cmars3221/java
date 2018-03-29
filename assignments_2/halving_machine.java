package assignments_2;
import java.util.Scanner;

public class halving_machine {

	public static void main(String[] args) {
		
		Scanner user_in = new Scanner(System.in);
		int get = user_in.nextInt();
		
		
		while( get > 1) {
			if(get%3==0) {
				get = (get+1/2);
				System.out.println(get);
			}else {
				get = (get/2);
				System.out.println(get);

			}
			
			get--;
		}
		
	       
		
		user_in.close();
		
		
		
		
	}

}
