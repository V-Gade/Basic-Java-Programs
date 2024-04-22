package BasicJavaPrograms;
import java.util.*;

public class CheckNumPalindromORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer number:");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		
		while(temp!=0) 
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev) 
		{
			System.out.println("Entered number is palindrom");
		}
		else 
		{
			System.out.println("Entered number is not palindrom");
		}

	}

}
