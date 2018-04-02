package assignments4;
import java.util.Scanner;

public class MovementOn2D {

	public static void main(String[] args) {

		char [][]array1 = new char[5][5];

  		Scanner sc = new Scanner(System.in);

		  		int x = 0, y=0;
		  		
		//Start of while loop
		  	  while((x>=0 && x<=4) && (y>=0 && y<=4)) {
		  		    
		  		for(int i = 0; i<array1.length; i++) {
					for(int j =0; j<array1.length; j++) {
						  		array1[i][j] = 'o';						//populating each grid value.. Leaving it blank..for now.
					}
					
				}
				
		  		
		  		//User input during loop.
		  		System.out.println("Where do you want to move? (‘l’, ‘r’, ‘u’,’d’)");
			  		String answer= sc.nextLine();
			  		answer = answer.toLowerCase();
		  	  
		  	  //movement along rows and columns
			  		
		  		switch(answer) {
		  		case "l":
		  			array1[x][y-1] = 'x';
		  			 y--;
		  		break;
		  		case "r":
		  			array1[x][y+1] = 'x';
		  			y++;
		  		break;
		  		case "u":
		  			array1[x-1][y-1] = 'x';
		  			x--;
		  		break;
		  		case "d":
		  			array1[x+1][y] = 'x';
		  			x++;
		  		break;
		  		default:
		  			System.out.println("End of the line...exiting program");
		  		}
		  		
		  		
		   	    for(char[]x_1 : array1) {   
		   	    	for(char x_2: x_1) {  
		   	    		System.out.print(x_2 + " ");    
		   	    	}
		   	    	
		   	    		System.out.println(); 
		   	    }
		   	    
		   sc.close();	    
		   	 
		  } // end of while loop
			   
			   
	}
}

