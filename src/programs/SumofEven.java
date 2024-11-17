package programs;


public class SumofEven {

	public static void main(String[] args) {
		
		int n=0,sum=0;
		
		while(n%2==0||n<=20)
		{
			sum=sum+n;
			n++;
		
		}
		
		System.out.println("The Sum of Even No. Between 1 to 20  is="+ sum+ (" "));
	}

}
