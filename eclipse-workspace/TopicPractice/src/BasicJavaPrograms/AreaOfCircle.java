package BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle : ");
		double pie=3.14;
		double r=sc.nextDouble();
		double result=0;
		
		result=pie*r*r;
		
		System.out.println("Area of Circle :" +result);
	}

}
