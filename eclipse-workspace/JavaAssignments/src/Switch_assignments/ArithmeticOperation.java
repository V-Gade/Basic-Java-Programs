package Switch_assignments;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the first number");
		int b=sc.nextInt();
		
		System.out.println("Enter which operation you want to perform");
		char result=sc.next().charAt(0);
		switch(result)
		{
		case '+':
			int c= a+b;
			System.out.println("You are ans is : " +c);
			break;
			
		case '-':
			int d= a-b;
			System.out.println("You are ans is : " +d);
			break;
		case '*':
			int e= a*b;
			System.out.println("You are ans is : " +e);
			break;
		case '/':
			int f= a/b;
			System.out.println("You are ans is : " +f);
			break;
		case '%':
			int g= a%b;
			System.out.println("You are ans is : " +g);
			break;
			
		default :
			System.out.println("please enter valid input");
			
		}
		


	}

}
