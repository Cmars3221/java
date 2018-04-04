package assignment6;

public class Manager extends Employee {

	double salary;
	
Manager(long id, String Name, String address, long phone, double salary){

super(id, Name,  address, phone);

	}


protected  double calculateTransportAllowance(){
	
	double transportAllowance = (15/100)*basicSalary;
	System.out.println(transportAllowance);
	return transportAllowance;
	
}

}