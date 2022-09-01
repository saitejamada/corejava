package stringexamples;

import java.util.Scanner;

public class IntialSurName 
{
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The String  ");
		  String s=sc.nextLine();
		 String[] arr= s.split(" ");
		 int n=arr.length-1;
		  for(int i=0;i<arr.length;i++)
		  {
			  if(i!=n)
			  {
				  arr[i]=arr[i].toUpperCase().substring(0, 1);
				 
			  }
			  System.out.print(arr[i]+".");
		  }	 
	}
}
