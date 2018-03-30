package assignments_3;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		int[] array1 = {2,4,6,8,19,14,2,3,18,99};
		int[] array2 = new int[0];
		
		 array2 = array1.clone();
		 
		 
		 //Testing for equality.
		 
		 //Test method 1: 

/*		if(array1 != array2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
*/		 
		 
		 //Test method 2:
		 System.out.println(Arrays.equals(array1, array2));

		 
		
	}

}
