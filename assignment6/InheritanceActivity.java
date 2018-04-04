package assignment6;

public class InheritanceActivity extends Employee {

	public InheritanceActivity(long id, String Name, String address, long phone) {
		super(id, Name, address, phone);
	}

	public static void main(String[] args) {

			
			
			Manager man1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);

			man1.calculateTransportAllowance();
			
			Trainee man2 = new Trainee(29846,"Jack","Mumbai India",442085,45000);
			
			man2.calculateTransportAllowance();

						
					
		}
		
	}


