package BasicJavaPrograms;
import java.util.*;
public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer number : ");
		
	int n=sc.nextInt();
	int res = 0;
	System.out.println("Table : ");
	
	for(int i=1;i<=10;i++) 
	{
		 res=i*n;
		 System.out.println(res);
	}
		
	}

}
