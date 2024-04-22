package BasicJavaPrograms;

import java.io.ObjectInput;
import java.util.Arrays;
import java.util.Objects;

public class AnagramProgram {
	
	public static boolean isAnagram(String str1, String str2) {
		
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");
		if(str1.length()!=str2.length())
		{
		    System.out.println("String is not Anagram");
			return false;
		}
		else 
		{
			char c1[]=str1.toLowerCase().toCharArray();
			char c2[]=str1.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("String is Anagram");
			
		return Arrays.equals(c1, c2);	
		
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isAnagram("Cat", "ACT");
		//System.out.println("");

	}

}
