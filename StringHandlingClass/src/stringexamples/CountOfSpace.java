package stringexamples;

import java.util.Scanner;

public class CountOfSpace 
{
 public static void main(String[] args) 
 {
	 int count=0;int scount=0;
		Scanner sc=new Scanner(System.in);
		  	
		  	System.out.println("Enter The String");
		  	String s=sc.nextLine();
		  	 for(int i=0;i<s.length();i++)
	  		 {
	  			char c=s.charAt(i);
	  			if(c>=33&&c<=47 || c>=58&&c<=64 || c>=91&&c<=46 || c>=123&&c<=126 )
	  			{
	  				count++;
	  			}
	  			else if(c==' ')
	  			{
	  				scount++;
	  				
	  			}
	  		 }
		  	 System.out.println("Special characters present in string are "+count);
		  	System.out.println("Spaces present in string are "+scount);
}
}
