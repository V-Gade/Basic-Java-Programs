package BasicJavaPrograms;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		
		int a=0,b=1,c;
		System.out.println("Fibonnaci Series is :");
		System.out.print(a +" ");
		System.out.print(b +" ");
		for(int i=0;i<=n;i++)
		//for(int i=0;i<=10;i++) 
		{
		 	c=a+b;
		 	System.out.print(c+" ");
		 	a=b;
		 	b=c;
		}
		
		}
	}


