package programs;

import java.util.Scanner;

 class Employee {
     int EmpId;
     String EmpName;
     
	
	private void getinfo() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee ID:");		
		EmpId=sc.nextInt();
		sc=new Scanner(System.in);
		System.out.println("Enter the Employee Name:");		
		EmpName=sc.nextLine();
	}
	
	void showinfo() {
		getinfo();
		System.out.println("Employee ID: "+EmpId);		
		System.out.println("Employee Name: "+EmpName);		
	}
	
	//public class EmployeeInfo
	//{
	public static void main(String[] args) {
		
		Employee em=new Employee();
		
		em.showinfo();
	}
	//}
	
		
	}
	
	


