package assignments4;
import java.util.Scanner;
public class SumOfColumn {

	public static void main(String[] args) {

		int [][]int_array1 = new int[3][3];
		
		int_array1[0][0]= 34;
		int_array1[0][1]= 12;
		int_array1[0][2]= 6;
		
		int_array1[1][0]= 66;
		int_array1[1][1]= 96;
		int_array1[1][2]= 43;
		
		int_array1[2][0]= 71;
		int_array1[2][1]= 22;
		int_array1[2][2]= 67;
		
		int choice;
		int result;
		
		Scanner add = new Scanner(System.in);
		
		System.out.println("Which column do you want to add. 1, 2, 3 ?");
			 choice = add.nextInt();
			
			if (choice == 1) {
			    result = (int_array1[0][0] + int_array1[1][0]+int_array1[2][0]);
			    System.out.println(result);
			}
			else if (choice == 2) {
			    result = (int_array1[0][1] + int_array1[1][1]+int_array1[2][1]);
			    System.out.println(result);
			}
			else if (choice == 3) {
			    result = (int_array1[0][2] + int_array1[1][2]+int_array1[2][2]);
			    System.out.println(result);
			}else {
				System.out.println("Column not available. Ending program");
			}
		
		
		
		add.close();
		
		
		
	}

}
