package programs;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		
		int n,sum=0,num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the No.");
		n=sc.nextInt();
		
		while(n!=0)
			
		{
			
			num=n%10;
			sum=sum+num;
			n=n/10;
		}
		n++;
		System.out.println("The Sum of the Given Digit is=" + sum+ (" "));

		

	}

}
