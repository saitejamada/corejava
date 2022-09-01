package stringexamples;

import java.util.Scanner;

public class RemoveSpecificCharacter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String  ");
		  String s=sc.nextLine();
		  char q;
		  System.out.println("Enter The character to Remove");
		  char ch=sc.next().charAt(0);
		  System.out.print("After Removing The Character In String == ");
		  for(int i=0;i<s.length()-1;i++)
		  {
			  char c=s.charAt(i);
			if(c==ch)
			{
	    	c=s.charAt(i+1);
			}
			System.out.print(c);
		  }
		 
	}
}
