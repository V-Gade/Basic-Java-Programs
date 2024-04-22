package BasicJavaPrograms;

import java.util.Scanner;

public class EvenOddNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		double a=sc.nextDouble();
//		System.out.println("Enter second number : ");
//		int b=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Entered number is even");
		}
		else 
		{
			System.out.println("Entered number is not even");
		}

	}

}
