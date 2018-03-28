package assignments;


public class Cars_or_busses {

	public static void main(String[] args) {
		int people = 22;
		int cars  = 33;
		int buses = 44;

		

		if(cars > people) {
			System.out.println("We should take the cars");
		}
		else if(cars < people) {
			System.out.println("We should not take the cars.");
		}
		else {
			System.out.println("We can't decide.");
		}
		
		System.out.println();
		
		if(buses > cars) {
			System.out.println("That's too many buses.");
		}
		else if(buses < cars) {
			System.out.println("Maybe we should take the buses.");
		}
		else {
			System.out.println("We can't decide.");
		}
		
		System.out.println();
		
		if(people > buses) {
			System.out.println("Alright, let's just take the buses");
		}
		else {
			System.out.println("Let's just take the cars.");
		}
		
		
		
	}

}
