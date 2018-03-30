package assignments_3;

public class LargestValue {

	public static void main(String[] args) {
		
		int array1[] = {3,6,9,12,55,18,21,24,27,30};
		
		int maxNum = 0;
		
		 for(int i=0; i<array1.length;i++) {

			 	if(array1[i] > array1[maxNum]) {
			 		maxNum = i;
			 	}
			 
		 }
		
			System.out.println("The largest value in this array is:" + array1[maxNum] );

		
		
		
	}

}
