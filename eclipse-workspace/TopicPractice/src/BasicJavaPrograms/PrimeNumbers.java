package BasicJavaPrograms;
import java.util.*;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N is :");
		int N=sc.nextInt();
		printPrimeNumber(N);
		
	}
		
	public static void printPrimeNumber(int limit) {
		// TODO Auto-generated method stub
		for(int i=2;i<=limit;i++)
		{
			if(isPrime(i)) {
			System.out.println(i +" ");
			}
		}
		
	}
		static boolean isPrime(int num) 
		{
			if(num <=1)
			{
				return false;
			}
			for(int i=2;i*i<=num;i++)
			{
			if(num%i==0) 
			{
				return false;
			}
			}
			return true;
		
		}
}

