package BasicJavaPrograms;

public class EvenSumOfFiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,c,t=0;
		for(int i=0;i<10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			if(c%2==0)
			{
				t=t+c;
			}	
		}
		System.out.println("Even sum of fibonacci series is : "+t);
		}
		
		
}
	
