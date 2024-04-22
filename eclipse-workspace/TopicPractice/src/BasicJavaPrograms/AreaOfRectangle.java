package BasicJavaPrograms;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle : ");
		double l=sc.nextDouble();
		System.out.println("Enter Width of Rectangle : ");
		double w=sc.nextDouble();
		double result=0;
		
		result=l*w;
		
		System.out.println("Area of Rectangle :" +result);

	}

}
