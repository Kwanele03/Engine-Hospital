
public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Managers manager = new Managers(22174375, "Kwanele Ntshele", "Leadership and Management", "2019-02-17", 1200, "Kwanele@2217");
        Doctor doctor = new Doctor(22003412, "Dr David Jones", "Health Dep and Operations.", "2021-02-17", 950, "David@2200");
        Nurses nurse = new Nurses(22175678, "Rebecca Nadioo","Labour and Operations Dep.","2022-02-10", 600, "Rebecca@2217");
    
        System.out.printf("My name is %s and I work in %s Derpartment \n", manager.getNmae(), manager.getDepartment());
	}

}
