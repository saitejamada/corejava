package stringexamples;

import java.util.Scanner;

public class NumberOfWords 
{
	
	public static void main(String[] args)
	{
		int count=1;
		Scanner sc=new Scanner(System.in);
	  	
	  	System.out.println("Enter The String");
	  	String s=sc.nextLine();
	  	char ch[]= s.toCharArray();
	  	 for(int i=0;i<s.length();i++)
  		 {
  			if(ch[i]==' ' || ch[i]==32)
  			{
  				count++;
  			}
  			
  		 }
	  	 System.out.println("Number Of Words Are is "+count);
	}
}
