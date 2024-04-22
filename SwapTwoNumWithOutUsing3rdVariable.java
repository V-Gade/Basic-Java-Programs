package BasicJavaPrograms;

import java.util.Scanner;

public class SwapTwoNumWithOutUsing3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a=sc.nextInt();
		System.out.println("Enter second number : ");
		int b=sc.nextInt();
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("Swapped numbers are :"+a +" "+b);

	}

}
