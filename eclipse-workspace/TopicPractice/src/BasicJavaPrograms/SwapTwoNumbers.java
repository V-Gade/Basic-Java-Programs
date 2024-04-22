package BasicJavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Swapped numbers are :"+a +" "+b);
		

	}

}
