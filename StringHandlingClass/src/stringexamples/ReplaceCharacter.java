package stringexamples;

import java.util.Scanner;

public class ReplaceCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		  System.out.println("Enter The String  ");
		  String s=sc.nextLine();
		  System.out.println("Enter The character to Replace");
		  char ch=sc.next().charAt(0);
		  System.out.println("Enter The character to be Replaced With");
		  char ch1=sc.next().charAt(0);
		  
		  for(char c1:s.toCharArray())
		  {
	    	if(c1==ch)
	    	{
			  c1=ch1;
	    	}
	    	System.out.print(c1);
		  }
	}

}
