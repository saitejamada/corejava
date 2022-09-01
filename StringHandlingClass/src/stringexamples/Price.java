package stringexamples;

import java.util.Scanner;

public class Price 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=0;int price=0;
		System.out.println("Enter The String  ");
		  String s=sc.nextLine();
	
		  for(int i=0;i<s.length();i++)
		  {
			  char c=s.charAt(i);
			  if(c>=48 && c<=57)
			  {
				 n=n*10+c-48;
			  }
			 else
			  {
				 price+=n;
				  n=0;
			  }
		  }
		  
		  System.out.println("Price is "+(price+n));
	}
}
