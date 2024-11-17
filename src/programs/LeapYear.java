package programs;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter a year for it is leap year or not?");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		
		if((year%4==0)&&(year%100!=0)||year%400==0)
		{
		 System.out.println("Leap Year:"+year);
		}
		else
		{
			System.out.println("Not Leap Year:"+year);
		}
	}
}
