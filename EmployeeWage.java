package employeeWagePackage;

import java.util.Scanner;

public class EmployeeWage {


	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation\n");
		EmployeeWage emp=new EmployeeWage();
		emp.companyInfo();	
	} 
	
	public void companyInfo() {
		
		Scanner sc=new Scanner(System.in);
		 int wagePerHour;
		 int noofWorkingDays;
		 int noofMaxHours;
		 String companyName;
		 
		 System.out.println("Enter your Company name");
		 companyName=sc.nextLine();
		 System.out.println("Enter wage per hour");
		 wagePerHour=sc.nextInt();
		 System.out.println("enter no of working days per month");
		 noofWorkingDays=sc.nextInt();
		 System.out.println("Enter the no of max hours per month");
		 noofMaxHours=sc.nextInt();
		 calcSalary(companyName, wagePerHour, noofWorkingDays, noofMaxHours);
		 
	}

	public void calcSalary (String companyName, int wagePerHour, int noofWorkingDays,int noofMaxHours) {
		
		  	int fullDayHour;
			final int fullTime=1;
			final int partTime=2;
			int EmpWage=0;
			int noofdays=0;
			int noofhours=0;
			
			while (noofdays<noofWorkingDays && noofhours<noofMaxHours) {
				
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
			
			System.out.println("wage of the employee for "+companyName+ " is "+EmpWage);
	}
	
}
