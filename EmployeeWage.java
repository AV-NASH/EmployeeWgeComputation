package employeeWagePackage;

public class EmployeeWage {
public static final int wagePerHour=20;
public static final int noofWorkingDays=20;
public static final int noOfMaxHours=100;


	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
		int fullDayHour;
		final int fullTime=1;
		final int partTime=2;
		int EmpWage=0;
		int noofdays=0;
		int noofhours=0;
		
		while (noofdays<noofWorkingDays && noofhours<noOfMaxHours) {
			
		
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
			
			noofhours=noofhours+fullDayHour;
			noofdays=noofdays+1;
			int wage=wagePerHour*fullDayHour;
			 EmpWage=EmpWage+wage;
		}
		
		System.out.println("wage of the employee is"+EmpWage);
	} 
}
