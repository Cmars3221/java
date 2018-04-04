package assignment6;

public class Employee {
	
	long employeeId; 
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 25;
	double Hra = 1000.50;
	


	public Employee(long id, String Name, String address,long phone){
				
				this.employeeId = id;
				this.employeeName = Name;
				this.employeeAddress = address;
				this.employeePhone = phone;
	}
	
	
	
	
	//salary method and local variable declaration
	 double salary;
	
	protected double calculateSalary(){
	
	 salary = basicSalary + (basicSalary * specialAllowance/100) + 
			  (basicSalary * Hra/100);
	 
	  		return salary; 
	}
	
	protected double calculateTransportAllowance(){
		
		double transportAllowance = (10/100)*basicSalary;
		System.out.println(transportAllowance);
		return transportAllowance;
		
	}

	

}

