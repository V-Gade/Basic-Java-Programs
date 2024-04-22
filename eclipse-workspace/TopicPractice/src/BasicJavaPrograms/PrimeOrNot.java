package BasicJavaPrograms;
import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer number :");
		int n=sc.nextInt();
		int temp=0;
		
		for(int i=2;i<=n-1;i++) 
		{
			if(n%i==0) 
			{
			temp=0+1;	
			}
		}
		if(temp==0) 
		{
			System.out.println("Entered number is prime");
		}
		else 
		{
			System.out.println("Entered number is not prime");
		}

	}

}
