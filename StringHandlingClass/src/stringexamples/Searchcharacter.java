package stringexamples;

import java.util.Scanner;

public class Searchcharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter The String  ");
		  String s=sc.nextLine();
		  System.out.println("Enter The character to Search");
		  char ch=sc.next().charAt(0);
		  
		  int i=s.indexOf(ch);
		  for(char c1:s.toCharArray())
		  {
	    	if(c1==ch)
			  count++;
		  }
		  if(count>=1)
		  System.out.println("The character Is Present at "+i+" Index And Occurs "+count+" Times" );
		  else
			  System.out.println("character is Not Present In String");
		
	}
}
