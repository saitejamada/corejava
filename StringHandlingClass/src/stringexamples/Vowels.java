package stringexamples;

import java.util.Scanner;


public class Vowels
{
  public static void main(String[] args)
  {
	  int vcount=0;
	  int ccount=0;
	  	Scanner sc=new Scanner(System.in);
	  	
	  	System.out.println("Enter The String");
	  	String s=sc.nextLine();
	
	  		String s1=new String(s);
	
	         for(int i=0;i<s1.length();i++)
	  		 {
	  			char ch=s.charAt(i);
	  			if(ch==32)
	  			{
	  				continue;
	  			}
	  			else if(ch == 97|| ch == 101|| ch == 105|| ch == 111|| ch == 117  ||ch == 65|| ch == 69|| ch == 73|| ch == 79|| ch == 85 )
	  			{
	  				vcount++;
	  			}
	  			else if((ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90 ))
	  			{
	  		     	ccount++;
	  			}
	  			 
	  		}
	  	System.out.println("The number of Vowels in String are"+vcount);
	    System.out.println("The number of Constants in String are"+ccount);
  }
}
