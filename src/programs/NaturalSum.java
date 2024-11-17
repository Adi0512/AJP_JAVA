package programs;

import java.util.Scanner;

public class NaturalSum {

	
	public static void main(String[] args) {
		
		int n,sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the last natural No.");
		n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The Sum of Natural No. is="+ sum+ (" "));
			
		

	}

}
