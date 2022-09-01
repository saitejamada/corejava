package stringexamples;

import java.util.Scanner;

public class OccuranceOfCharacter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int len=0;
		System.out.println("Enter The String  ");
		  String s=sc.nextLine();
		  System.out.println("Enter The character to find occurance");
		  char ch=sc.next().charAt(0);
		    for(char c1:s.toCharArray())
			  {
		    	if(c1==ch)
				  len++;
			  }
		    System.out.println("Number Of  Occurance Of A Given Character Is "+len);
	}
}
