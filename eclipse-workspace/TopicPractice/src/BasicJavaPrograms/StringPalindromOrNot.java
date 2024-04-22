package BasicJavaPrograms;

public class StringPalindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A="madam";
		String temp=A,rev="";
		for(int i=temp.length()-1;i>=0;i--) 
		{
			rev=rev+temp.charAt(i);
		}
		//System.out.println(rev);
		if(A.equals(rev)) 
		{
			System.out.println("String is palindrom");
		}
		else 
		{
			System.out.println("String is not palindrom");
		}

	}

}
