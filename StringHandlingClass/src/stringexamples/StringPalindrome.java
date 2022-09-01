package stringexamples;

import java.util.Scanner;

class Palindrome
{
	public boolean checkPalindrome(String s)
	{
		char c1[]=s.toCharArray();
		char c2[]=new char[s.length()];
		boolean res=false;
		int n=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			c2[n]=c;
			n++;
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(c1[i]==c2[i])
				res=true;
			else
				res=false;
				break;
		}
		if(res==true)
		{
			return true;
		}
		return false;
	}
	
}


public class StringPalindrome 
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter The String To check palindrome ");
  String s=sc.nextLine();
  Palindrome p=new Palindrome();
  System.out.println(" Given String is Palindrome True Of False "+p.checkPalindrome(s));
  }
}
