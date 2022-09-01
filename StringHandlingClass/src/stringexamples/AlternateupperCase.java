 package stringexamples;

import java.util.Scanner;

public class AlternateupperCase 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String  ");
	  String s=sc.nextLine();
	  for(int i=0;i<s.length();i+=2)
	  {
		  char c=s.charAt(i);
		  	if(i==s.length())
		  		break;
			  System.out.println("Alternate Character in uppercase"+(char)(c-32));
		  
	  }
}
}   
