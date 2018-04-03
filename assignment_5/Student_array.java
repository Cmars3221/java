package assignment_5;
import java.util.Scanner;

public class Student_array {
	

	public String name;
	public String grade; 
	public float gpa;
	

Student_array []array1 = new Student_array[3];
Student_array []array2 = new Student_array[3];
Student_array []array3 = new Student_array[3];


		public Student_array[] getArray1() {
	return array1;
}


public void setArray1(Student_array[] array1) {
	this.array1 = array1;
}


public Student_array[] getArray2() {
	return array2;
}


public void setArray2(Student_array[] array2) {
	this.array2 = array2;
}


public Student_array[] getArray3() {
	return array3;
}


public void setArray3(Student_array[] array3) {
	this.array3 = array3;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getGrade() {
	return grade;
}


public void setGrade(String grade) {
	this.grade = grade;
}


public float getGpa() {
	return gpa;
}


public void setGpa(float gpa) {
	this.gpa = gpa;
}


		


}
