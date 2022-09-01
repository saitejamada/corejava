package stringexamples;

import java.util.Scanner;

public class ReverseOfString 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String  ");
		  String s=sc.nextLine();
		  int len=0;int n=0;
		  
		  for(char c:s.toCharArray())
		  {
			  len++;
		  }
		  
		  char[] a=new char[len];
		  
		  for(int i=len-1;i>=0;i--)
		  {
			  char c=s.charAt(i);
			 a[n]= c;
			 n++;
		  }
		  
		  System.out.print("Reverse Of The String is == ");
		  for(int i=0;i<len;i++)
		  {
			System.out.print(a[i]);  
		  }
	}
}
