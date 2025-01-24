
import java.util.Scanner;
import Interface_Implementation.Staff;

public class Doctor extends Staff{
	
	Doctor(int iD, String fullName,  String derpartment, String experience, double salary, String password){
		super(iD, fullName, derpartment,experience, salary, password );
	}
	
	@Override
	public void work() {

		Scanner scanner = new Scanner(System.in);
		int duty;

		do {
		System.out.printf("Hi there %s. Check available responsibility: \n", this.getName());
		System.out.println("1. Appointment.");
		System.out.println("2. Treatment.");
		System.out.println("3. Operation.");
		System.out.println("4. Meeting.");
		System.out.print("Enter responsibilty by number: ");
		duty = scanner.nextInt();

		if (duty >= 1 || duty <= 4) {
		switch (duty) {
		case 1 ->  System.out.printf("You have an appointment %s. \n", this.getName());
		case 2 -> System.out.printf("You have patient to treatment %s. \n", this.getName()); 
		case 3 -> System.out.printf("You have no operation at the moment %s. \n", this.getName()); 
		case 4 -> System.out.printf("You have no meeting %s. \n", this.getName());
		}
	 } 
	break;	
   } while (duty != 4 );
		
     System.out.println("You are welcome!.");	
 	
	}
 
	@Override
	public void login() {
		this.getID();
		this.getPassword();
       
        Scanner scanner = new Scanner(System.in);
        while (true) {
        	
           System.out.print("Enter Your ID: ");
           int username = scanner.nextInt();
           scanner.nextLine();
           
           System.out.print("Enter password: ");
           String password = scanner.nextLine();

           if (username == this.getID() && password.equals(this.getPassword())) {
               System.out.println("Login successful!");
               break;
           } 
           else {
               System.out.println("Incorrect ID or password. Try again.");
           }   
       }
   }
	

}
