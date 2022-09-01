        package stringexamples;

import java.util.Scanner;

public class OccuranceOfEachCharacter
{
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int count=0;
		  System.out.println("Enter The String  ");
		  String s=sc.nextLine();
		  
		  for(int i=0;i<s.length();i++)
		  {
			  char c=s.charAt(i);
			  count=0;
			  	if(c ==' ')
			  	continue; 
			        for(int j=0;j<=i;j++)
			  		{
			  			if(c==s.charAt(j))
			  			{
			  				count++;
			  			}
			  		}
			  
			  	if(count==1)
			  	{
			  		count=0;
			  			char ch=c;
			  				for(char ch1:s.toCharArray())
			  				{
			  					if(ch1==ch)
			  						count++;
			    		
			  				}
			  				System.out.println("Character "+c+" Occurs "+count);
				  }
			}
	}
}
