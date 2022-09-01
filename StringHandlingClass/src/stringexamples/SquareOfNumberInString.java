package stringexamples;

import java.util.Scanner;

public class SquareOfNumberInString 
{
public static void main(String[] args)
{
	
	Scanner sc=new Scanner(System.in);
	int p=1;
	System.out.println("Enter The String  ");
	  String s=sc.nextLine();
	  for(int i=0;i<s.length();i++)
	  {
		  char c=s.charAt(i);
		  if(c>=48 && c<=57)
		  {                         
			 p=(c-48)*(c-48); 
			 System.out.println("Square Of Number "+c+" Is "+p);
		  }
		  
	  }
                         	
}
}
