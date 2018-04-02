package assignments4;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		
		char [][]tic  = new char[3][3];
		
		for (int i = 0; i < tic.length; i++) {
			  for (int j = 0; j < tic.length; j++) {
				  tic[i][j] = ' ';
			}	
		}
	
		tic[0][0] = ' ';
		tic[0][1] = ' ';
		tic[0][2] = ' ';
		tic[1][0] = ' ';
		tic[1][1] = ' ';
		tic[1][2] = ' ';
		tic[2][0] = ' ';
		tic[2][1] = ' ';
		tic[2][2] = ' ';
		//star of the game 
		
		boolean gameOn =true;
		int turn_increment = 0; 
		int row, column;
		
		while(gameOn) {
			
			
		Scanner player1 = new Scanner(System.in);
//		Scanner player2 = new Scanner(System.in);
		
		
		System.out.println("Enter your row");
			 row = player1.nextInt();
		
		
			System.out.println("Enter your column");
			    column = player1.nextInt();
	     turn_increment++;
			
			//inputs: 
		
			for(char[]x: tic) {
				for(char x_2: x) {
					System.out.print("|" + x_2 + "|");
				}
				System.out.println();
			}
			


			
		} // end of while loop. 
		

		

	}

}




