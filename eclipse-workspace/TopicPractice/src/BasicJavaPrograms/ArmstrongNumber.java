package BasicJavaPrograms;
import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer number : ");
		int n=sc.nextInt();
		
		int t1=n,length=0;
		while(t1!=0) 
		{
			t1=t1/10;
			length=length+1;
		}
		int rem,t2=n, arm=0;
		while(t2!=0) 
		{
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=length;i++) 
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(n==arm) 
		{
			System.out.println("Number is armstrong number.");
		}
		else
		{
			System.out.println("Number is not armstrong number");
		}
	}
	
}
		
	