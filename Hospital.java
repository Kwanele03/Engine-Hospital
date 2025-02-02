
public class Hospital {

	public static void main(String[] args) {
		
	Managers manager = new Managers(22174375, "Kwanele Ntshele", "Leadership and Management", "2019-02-17", 2200, "Kwanele@2217");
        Doctor doctor = new Doctor(22003412, "Dr David Jones", "Health Dep and Operations", "2021-02-17", 2550, "David@2200");
        Nurses nurse = new Nurses(22175678, "Rebecca Nadioo","Labour and Operations Dep.","2022-02-10", 1200, "Rebecca@2217");
    
       
        manager.login();
        System.out.printf("Your Staff ID is %d and you are is %s. You work under %s Derpartment for %s years. Annual salary is R%f \n", manager.getID(), manager.getName(), manager.getDepartment(), manager.calculateExperience(),manager.getSalary());
        System.out.println();
        
        
        doctor.login();
        System.out.printf("Your Staff ID is %d and you are is %s. You have worked under %s Derpartment for %s years. Annual salary is R%f \n", doctor.getID(), doctor.getName(), doctor.getDepartment(), doctor.calculateExperience(),doctor.getSalary());
        doctor.work();
        System.out.println();
        
        
        nurse.login();
        System.out.printf("Your Staff ID is %d and you are is %s. You work under %s Derpartment for %s years. Annual salary is R%f \n", nurse.getID(), nurse.getName(), nurse.getDepartment(), nurse.calculateExperience(),nurse.getSalary());
        System.out.println();

	}
}
