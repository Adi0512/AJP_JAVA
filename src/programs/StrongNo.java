package programs;
import java.util.Scanner;

public class StrongNo {

    public static void main(String[] args) {
        int n,num,fact,store=0,original;
        System.out.println("Enter the number to check if it is Strong or not?");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        original = n;  
        
        while (n != 0) {
            num = n % 10;  
            fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact*i;
            }
            store = store+ fact;
            n = n/10;  
        } 
        if (original == store)
        {
            System.out.println(original + " is a Strong number.");
        }
        else 
        {
            System.out.println(original + " is not a Strong number.");
        }

        sc.close();
    }
}
