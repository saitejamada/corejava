package stringexamples;

import java.util.Scanner;

public class StringAlternatives 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String  ");
	  String s=sc.nextLine();
	  char[] c1=s.toCharArray();
	  
	  for(int i=0;i<c1.length;i++)
	  {
		  	if(i==c1.length-1)
		  		break;
			  System.out.println(c1[i]+" alternate is "+c1[i+1]);
		  
	  }
}
}
