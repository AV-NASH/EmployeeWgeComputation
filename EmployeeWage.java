package employeeWagePackage;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation");
		
		int employeePresent =1;
		int value=(int)((Math.random()*10)%2);
		if(value==employeePresent) {
			System.out.println("Employee present");
		}
		
		else {
			System.out.println("Employee absent");
		}
	}
}
