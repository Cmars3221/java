package assignments_3;
import java.util.Scanner;

public class ValueinArray {

	public static void main(String[] args) {
	
		int array1[] = {11,2,66,4,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What value would you like to search for?");
		 int ask = sc.nextInt();
		 
		 
		 for(int i=0; i<array1.length;i++) {
			 if(i == ask) {
				 System.out.println("We found " +ask+ " it is in index position: "+(i-1)+" or slot: "+(i));
			 }else {
				 System.out.println("Sorry,not found in this slot. Try BestBuy");
			 }
			 
		 } 
		 
		 	sc.close();
	}

  }




