package assignments_2;
import java.util.Scanner;

public class Coordinates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the maximum x?");
		int input1 = sc.nextInt();
		System.out.println("What is the maximum y?");
		int input2 = sc.nextInt();
		
		for(int i=0; i <=input1; i++) {
			for(int j=0; j <=input2; j++) {
				System.out.println(i +","+ j);
			}
		}
		
		

		sc.close();

	}

}
