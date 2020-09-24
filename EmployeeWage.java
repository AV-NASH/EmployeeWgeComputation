package employeeWagePackage;

public class EmployeeWage {
public static int wagePerHour=20;


	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
		int fullDayHour;
		final int fullTime=1;
		final int partTime=2;
		
		int value=(int)((Math.random()*10)%3);
		
		switch (value) {
		case fullTime: {
			
					fullDayHour=8;
					break;
		}
		case partTime: {
					
					fullDayHour=4;
					break;
		}
		
		default: {
					
					fullDayHour=0;
					break;
				}
		}


		
		int wage=wagePerHour*fullDayHour;
		System.out.println("wage of the employee is"+wage);
	} 
}
