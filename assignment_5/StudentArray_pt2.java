package assignment_5;

import java.util.Scanner;

public class StudentArray_pt2 {

	public static void main(String[] args) {

		Students_pt2 student1 = new Students_pt2();
		Students_pt2 student2 = new Students_pt2();
		Students_pt2 student3 = new Students_pt2();

		Scanner sc1 = new Scanner(System.in);

	  	System.out.println("Enter name for Student: ");
	  	String f_name1 = sc1.nextLine();
	  		student1.setArray1(array1[0]=f_name1);
	  		
		System.out.println("Enter name Student2: ");
		 String f_name2 = sc1.nextLine();
		  student2.setName(f_name2);
		  
		System.out.println("Enter name Student 3: ");
		  String f_name3 = sc1.nextLine();
			student3.setName(f_name3);
	  		
		System.out.println("Enter grade for Student1:");
		String grade1 = sc1.nextLine();
		     student1.setGrade(grade1);
		  
		 System.out.println("Enter grade for Student2:");
		 String grade2 = sc1.nextLine();
	         student2.setGrade(grade2);	
	         
	    System.out.println("Enter grade for Student3:");
		String grade3 = sc1.nextLine();
		     student3.setGrade(grade3);	
		
		System.out.println("Enter gpa: ");
		float gpa1 = sc1.nextFloat();
			student1.setGpa(gpa1);
			
		System.out.println("Enter gpa: ");
		 float gpa2 = sc1.nextFloat();
			student2.setGpa(gpa2);
				
		System.out.println("Enter gpa: ");
		float gpa3 = sc1.nextFloat();
			student3.setGpa(gpa3);
					
				
			
		System.out.println(student1.getName());
		System.out.println(student1.getGrade());
		System.out.println(student1.getGpa());
			
		System.out.println();
			
		System.out.println(student2.getName());
		System.out.println(student2.getGrade());
		System.out.println(student2.getGpa());
		
		System.out.println();

		
		System.out.println(student3.getName());
		System.out.println(student3.getGrade());
		System.out.println(student3.getGpa());
			
		
	 float avarage = ((student1.getGpa()+student2.getGpa()+student3.getGpa())/3);

		
		System.out.println();
	
		System.out.println("The avarage GPA of the three students: " + avarage);
			
		
		sc1.close();

		
		
		
		
	}
	
	
	

}
