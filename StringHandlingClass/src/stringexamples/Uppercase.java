package stringexamples;

import java.util.Scanner;

class StringUpcase
{
	 
	public void getToUpperCase(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a' && c<='z')
			{
				c=(char)((int)c-32);
				System.out.print(c);
			}
			
		}
		
	}

}

public class Uppercase 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The String");
			String s=sc.next();
			StringUpcase s1=new StringUpcase();
		     s1.getToUpperCase(s);
		}
}
