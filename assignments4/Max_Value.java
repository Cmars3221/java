package assignments4;

public class Max_Value {

	public static void main(String[] args) {
	   // Max value.
		 //Create int array with 
		
		int [][]int_array1 = new int[3][3];
		
		int_array1[0][0]= 111;
		int_array1[0][1]= 122;
		int_array1[0][2]= 1;
		
		int_array1[1][0]= 222;
		int_array1[1][1]= 223;
		int_array1[1][2]= 2;
		
		int_array1[2][0]= 333;
		int_array1[2][1]= 334;
		int_array1[2][2]= 3;
		
	     int maxInt =0;
		
		
		for(int i = 0; i<int_array1.length; i++) {
			for(int j =0; j<int_array1.length;j++) {
				
				if(int_array1[i][j] > maxInt) {
					maxInt = int_array1[i][j];
				}
				
			}
		
		}
				System.out.println(maxInt);

		
		
	}

}
