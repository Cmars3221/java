package assignments;

public class if_statements {

	public static void main(String[] args) {
		int people = 22;
		int cats = 2;
		int dogs = 3; 
		
		//We are applying the comparison between the 
//		 people and cats
		 
		if (people < cats) {
			System.out.println("Too many cats! The world is doomed!");
		}
		//This is in fact there are too many cats...
		else{
			System.out.println("Too few cats! The world is saved for another day! :-( ");
		};
		
		//We are applying the comparison between the 
//		 people and dogs
		 
		if(people < dogs) {
			System.out.println("The world is drooled on!");
		}
		//Many dogs were neutered.
		else{
			System.out.println("The world is dry!");
		}
		
		
		
		
		
		
	}

}
