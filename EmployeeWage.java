package employeeWagePackage;

import java.util.Scanner;

public class EmployeeWage {
	
	 private int wagePerHour;
	 private int noofWorkingDays;
	 private int noofMaxHours;
	 private String companyName;


	public int getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(int wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	public int getNoofWorkingDays() {
		return noofWorkingDays;
	}

	public void setNoofWorkingDays(int noofWorkingDays) {
		this.noofWorkingDays = noofWorkingDays;
	}

	public int getNoofMaxHours() {
		return noofMaxHours;
	}

	public void setNoofMaxHours(int noofMaxHours) {
		this.noofMaxHours = noofMaxHours;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation\n");
		EmployeeWage emp1=new EmployeeWage();
		EmployeeWage emp2=new EmployeeWage();
		emp1.companyInfo();	
		emp2.companyInfo();
	} 
	
	
	public void companyInfo() {
		
		Scanner sc=new Scanner(System.in);
		
		 
		 System.out.println("Enter your Company name");
		 companyName=sc.nextLine();
		 System.out.println("Enter wage per hour");
		 wagePerHour=sc.nextInt();
		 System.out.println("enter no of working days per month");
		 noofWorkingDays=sc.nextInt();
		 System.out.println("Enter the no of max hours per month");
		 noofMaxHours=sc.nextInt();
		 
		 setCompanyName(companyName);
		 setNoofMaxHours(noofMaxHours);
		 setNoofWorkingDays(noofWorkingDays);
		 setWagePerHour(wagePerHour);
		 calcSalary();
		 
	}

	public void calcSalary () {
		
		  	int fullDayHour;
			final int fullTime=1;
			final int partTime=2;
			int EmpWage=0;
			int noofdays=0;
			int noofhours=0;
			int value;
			
			while (noofdays<noofWorkingDays && noofhours<noofMaxHours) {
				
				 value=(int)((Math.random()*10)%3);
				
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
