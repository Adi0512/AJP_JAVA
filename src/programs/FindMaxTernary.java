package programs;

import java.util.Scanner;

public class FindMaxTernary {

	public static void main(String[] args) {
		int a,b,max;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the First No.");
		a=sc.nextInt();
		
		System.out.println("Enter the Second No.");
		b=sc.nextInt();
		
		max=(a>b)?a:b;
		System.out.println("The Maximum No. is :"+max);
		
		
		

	}

}
