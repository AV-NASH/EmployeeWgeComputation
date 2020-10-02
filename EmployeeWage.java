package employeeWagePackage;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWage implements ICalculateWage {
	private ArrayList<CompanyWage> companyarraylist = new ArrayList<CompanyWage>();

	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation\n");
		ICalculateWage employeewage = new EmployeeWage();
		employeewage.CompanyInfo();

	}

	public void CompanyInfo() {

		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		String companyname;
		do {
			System.out.println("plase add company details");
			System.out.println("Enter your Company name");
			String companyName = scanner.nextLine();
			System.out.println("Enter wage per hour");
			int wagePerHour = scanner.nextInt();
			System.out.println("enter no of working days per month");
			int noofWorkingDays = scanner.nextInt();
			System.out.println("Enter the no of max hours per month");
			int noofMaxHours = scanner.nextInt();
			System.out.println("do you want to add more?\n" + "1. yes\n" + "2. no\n" + "Enter your choice\n");
			choice = scanner.nextInt();
			addCompany(companyName, wagePerHour, noofWorkingDays, noofMaxHours);
			scanner.nextLine();
		} while (choice == 1);

		do {
			System.out.println("\nPlease choose your next action\n" + "1. view total wage by company name\n"
					+ "2. view all companies total wage\n" + "3. Exit\n" + "Enter your choice\n");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter the company name");
				companyname = scanner.nextLine();
				viewWageByCompanyName(companyname);
				break;
			}
			case 2: {
				showWage();
				break;
			}
			default:
				System.out.println("thank you for using application");
			}
		} while (choice != 3);
		scanner.close();
	}

	public void addCompany(String companyName, int wagePerHour, int noofWorkingDays, int noofMaxHours) {

		CompanyWage companywage = new CompanyWage(wagePerHour, noofWorkingDays, noofMaxHours, companyName);
		calcSalary(companywage);
		companyarraylist.add(companywage);

	}

	public void calcSalary(CompanyWage calcwage) {

		int fullDayHour;
		final int fullTime = 1;
		final int partTime = 2;
		int EmpWage = 0;
		float EmpDaiyWage = 0;
		int noofdays = 0;
		int noofhours = 0;
		int value;
		int noofdaysworked = 0;

		while (noofdays < calcwage.getNoofWorkingDays() && noofhours < calcwage.getNoofMaxHours()) {
			noofdaysworked++;
			value = (int) ((Math.random() * 10) % 3);

			switch (value) {
			case fullTime: {
				fullDayHour = 8;
				break;
			}
			case partTime: {
				fullDayHour = 4;
				break;
			}

			default: {
				fullDayHour = 0;
				break;
			}
			}

			noofhours = noofhours + fullDayHour;
			noofdays = noofdays + 1;
			int wage = calcwage.getWagePerHour() * fullDayHour;
			EmpWage = EmpWage + wage;
		}

		EmpDaiyWage = (float) EmpWage / noofdaysworked;
		calcwage.setTotalWage(EmpWage);
		calcwage.setDailyWage(EmpDaiyWage);
	}

	public void showWage() {
		for (CompanyWage compwage : companyarraylist) {
			System.out.println(compwage);
		}
	}

	public void viewWageByCompanyName(String companyname) {
		for (CompanyWage comparename : companyarraylist) {
			if (comparename.getCompanyName().equals(companyname)) {
				System.out.println(comparename);
			}
		}
	}

}

class CompanyWage {

	private int wagePerHour;
	private int noofWorkingDays;
	private int noofMaxHours;
	private String companyName;
	private float dailyWage;
	private int totalWage;

	public CompanyWage(int wagePerHour, int noofWorkingDays, int noofMaxHours, String companyName) {
		super();
		this.wagePerHour = wagePerHour;
		this.noofWorkingDays = noofWorkingDays;
		this.noofMaxHours = noofMaxHours;
		this.companyName = companyName;
	}

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

	public float getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(float dailyWage) {
		this.dailyWage = dailyWage;
	}

	public int getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	@Override
	public String toString() {
		return "Total wage for " + companyName + " is " + totalWage;
	}

}

interface ICalculateWage {
	public void CompanyInfo();

	public void addCompany(String companyName, int wagePerHour, int noofWorkingDays, int noofMaxHours);

	public void calcSalary(CompanyWage calcwage);

	public void showWage();

}
