package assignments_2;
import java.util.Scanner;
public class SimpleExpression {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		System.out.println(first);
		String symbol = sc.next();
		System.out.println(symbol);
		int second = sc.nextInt();
		System.out.println(second);

		while(first!=0){
	
		switch(symbol) {
		case "+":
			System.out.println(first +  " + " +  second + ": "+(first+second));
			first=0;
			break;
		case "-":
			System.out.println(first +  " + " +  second + ": "+(first-second));
			first=0;
			break;
		case "/" : 
			System.out.println(first +  " + " +  second + ": "+(first/second));
			first=0;
			break;
		case "*" : 
			System.out.println(first +  " + " +  second + ": "+(first*second));
			first=0;
			break;
		default:
			System.out.println("Not an operation");

			}
		
		}
		
		sc.close();
	}

	
}

