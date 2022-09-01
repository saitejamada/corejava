package stringexamples;

import java.util.Scanner;

public class HighestOccurance
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	 int count=0;int max=0;char a=' ';
	  System.out.println("Enter The String  ");
	  String s=sc.nextLine();
	  for(int i=0;i<s.length();i++)
	  {
		  char c=s.charAt(i);
		  count=0;
		  	if(c ==' ')
		  	continue; 
		        for(int j=0;j<s.length();j++)
		  		{
		  			if(c==s.charAt(j))
		  			{
		  				count++;
		  			}
		  		}
		        if(count>max)                             
		        {
		        	max=count;
		        	a=c;
		        }
		
	  	}
	  System.out.println("Maximum Occurance of character is "+a+"Occurs "+max+"Times");
	}
}