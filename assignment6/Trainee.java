package assignment6;

public class Trainee extends Employee{

	
	double salary;
	
	public Trainee(long id, String Name, String address, long phone, double salary ) {
		super(id, Name, address, phone);
	
	
	}
	
	
	protected double calculateTransportAllowance(){
		
		double transportAllowance = (10/100)*basicSalary;
		return transportAllowance;
		
	}

	
	


	
}
