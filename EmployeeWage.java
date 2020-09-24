package employeeWagePackage;

public class EmployeeWage {
public static int wagePerHour=20;
public static int noofWorkingDays=20;


	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
		int fullDayHour;
		final int fullTime=1;
		final int partTime=2;
		int EmpWage=0;
		
		for (int i = 0; i < noofWorkingDays; i++) {
			
		
			int value=(int)((Math.random()*10)%3);
			
			switch (value)
			{
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
			 EmpWage=EmpWage+wage;
		}
		
		System.out.println("wage of the employee is"+EmpWage);
	} 
}
