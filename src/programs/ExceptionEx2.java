package programs;

import java.util.Scanner;

public class ExceptionEx2 {
	
	public static void fun (int n)
	{
		if(n==2)
			throw new ArithmeticException();
		else
			System.out.println("The number is: "+n);
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n =sc.nextInt();
		try
		{
			fun(n);
			
		}
		catch(ArithmeticException e )
		{
			System.out.println("Enter any number except 2.");
		}
		
	}

}
