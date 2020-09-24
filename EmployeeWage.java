package employeeWagePackage;

public class EmployeeWage {
public static int wagePerHour=20;


	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
		int fullDayHour;
		int employeePresent =1;
		int value=(int)((Math.random()*10)%2);
		if(value==employeePresent) {
			fullDayHour=8;	
		}

		else {
				fullDayHour=0;
		}
		
		int wage=wagePerHour*fullDayHour;
		System.out.println("wage of the employee is"+wage);
	} 
}
