package stringexamples;

import java.util.Scanner;

public class Concate 
{
 
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
	  	int a=0;
	  	System.out.println("Enter The String");
	  	String s=sc.nextLine();
	  	System.out.println("Enter The string you want to concatinate");
	  	String s1=sc.nextLine();
	  	
	  	
	  	char cArray[]=new char[s.length()+s1.length()];
	  	
	  	 for(int i=0;i<s.length();i++)
         {
	  		 char c=s.charAt(i);
	  		 if(c>='a' && c<='z'|| c>='A' && c<='Z' )
	  		 {
	  			cArray[i]=c;
	  			a=i;
	  		 }
         }
	  	 a++;
	  	for(int i=0;i<s1.length();i++)
        {
	  		char c=s1.charAt(i);
	  		 if(c>='a' && c<='z'|| c>='A' && c<='Z' )
	  		 {
	  			cArray[a]=c;
	  		 a++;
	  		 }
        }
	  	System.out.print("String After removing numbers And concating ");
          for(int i=0;i<a;i++)
          {
        	  System.out.print(cArray[i]);
          }


}
}
