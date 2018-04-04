package assignment7;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {

		KidUsers kid1 = new KidUsers();
		KidUsers kid2 = new KidUsers();
		
		 //1st kid user
		 kid1.age = 10;
		 kid1.registerAccount();
		 
		 System.out.println();
		 
		 kid1.bookType = "Kids";
		 kid1.requestBook();
		 
		 System.out.println();
		 kid2.age = 18;
		 kid2.registerAccount();
		 
		 System.out.println();

		 kid2.bookType = "Fiction";
		 kid2.requestBook();
		 
		 System.out.println();
		 
		 //1st adult user. 
		AdultUser adult1 = new AdultUser();
		AdultUser adult2 = new AdultUser();
	
			adult1.age = 5;
			adult1.registerAccount();
			
			adult1.bookType = "Kids";
			adult1.requestBook();
			
			System.out.println();
			
		//2nd adult user. 
			adult2.age = 23;
			adult2.registerAccount();
			
			System.out.println();
			adult2.bookType = "Fiction";
			adult1.requestBook();
			
			


	}

}
