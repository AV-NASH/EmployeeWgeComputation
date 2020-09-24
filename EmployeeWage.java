package employeeWagePackage;

public class EmployeeWage {
public static int wagePerHour=20;


	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
		int fullDayHour;
		int fullTime=1;
		int partTime=2;
		
		int value=(int)((Math.random()*10)%3);
		if(value==fullTime) {
			fullDayHour=8;	
		}

		else { if(value==partTime) {
				fullDayHour=4;
				}
			
				else {
					fullDayHour=0;
					
				}
		
		}
		
		int wage=wagePerHour*fullDayHour;
		System.out.println("wage of the employee is"+wage);
	} 
}
