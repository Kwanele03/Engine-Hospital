
import java.util.Scanner;

import Interface_Implementation.Staff;

public class Doctor extends Staff{
	

	
	Doctor(int iD, String fullName,  String derpartment, String experience, double salary, String password){
		super(iD, fullName, derpartment,experience, salary, password );
	
	}
	
	@Override
	public void work() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("What service do you want?: ");
		String duty = scanner.nextLine();
		scanner.nextLine();
		
		switch(duty) {
		case "Appointment": System.out.printf("You have an appointment %s. \n", this.getName()); break;
		case "Treatment": System.out.printf("You have treatment with a paatient %s. \n", this.getName()); break;
		case "Operation": System.out.printf("You have an operation a paatient %s. \n", this.getName()); break;
		default: System.out.println("You do not have an appointment"); break;
		}	
		
		scanner.close();	
	}
	

}
