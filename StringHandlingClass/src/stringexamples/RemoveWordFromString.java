package stringexamples;

import java.util.Scanner;

public class RemoveWordFromString 
{
public static void main(String[] args) 
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The String  ");
	String s=sc.nextLine();
	System.out.println("Enter The Word to Remove  ");
	String word=sc.nextLine();
	String[] arr= s.split(" ");
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i].equals(word))
		{
			arr[i]=" ";
		}
		System.out.print(arr[i]);
	}

	
}
}
