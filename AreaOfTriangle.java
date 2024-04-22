package BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of Triangle : ");
		double h=sc.nextDouble();
		System.out.println("Enter Base of Triangle : ");
		double b=sc.nextDouble();
		double a=0.5;
		double result=0;
		
		result=a*h*b;
		
		System.out.println("Area of Triangle :" +result);
	}

}


