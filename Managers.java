


import java.util.Scanner;

import Interface_Implementation.Staff;

public class Managers extends Staff{
	

	Managers(int iD, String fullName,  String derpartment, String experience, double salary, String password){
		super(iD, fullName, derpartment,experience, salary, password );
	
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
