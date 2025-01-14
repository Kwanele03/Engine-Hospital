
import java.util.Scanner;

import Interface_Implementation.Staff;


public class Nurses extends Staff{
	

	Nurses(int iD, String fullName,  String derpartment, String experience, double salary, String password){
		super(iD, fullName, derpartment,experience, salary, password );
	
	}
	
	@Override
	public void work() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("What service do you want?: ");
		String duty = scanner.nextLine();
		scanner.nextLine();
		
		switch(duty) {
		case "Appointment": System.out.println("You have an appointment"); break;
		case "Treatment": System.out.println("You have treatment with a paatient."); break;
		case "Operation": System.out.println("You have an operation a paatient"); break;
		default: System.out.println("You do not have an appointment"); break;
		}	
		
		scanner.close();	
	}
	

}
