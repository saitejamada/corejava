package com.multithreading.password;
import java.util.*;
import java.util.regex.Pattern;

class InvalidPasswordException extends RuntimeException
{
	String msg;

	public InvalidPasswordException(String msg) {
		super(msg);
		this.msg = msg;
	}
}
class CheckPassWord
{
	  void validatePassword(String password)
	{
		  synchronized(this)
		  {
		int cap_count=0,low_count=0,spec_count=0,dig_count=0;
		
		try
		{
		if(password.length()>=8)
		{
			
//				char c=password.charAt(i);
//				if(c>='A' && c<='Z')
//				{
//					cap_count++;
//				}
//				else if(c>='a' && c<='z')
//				{
//					low_count++;
//				}
//				else if(c=='@' || c=='_' || c=='$' || c=='.')
//				{
//					spec_count++;
//				}
//				else if(c>='0' && c<='9')
//				{
//					dig_count++;
//			
			
			boolean res=Pattern.matches("((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%]).{8,25})", password);
			System.out.println(res);
			if(res) //cap_count>=1 && low_count>=1 && spec_count>=1 && dig_count>=1)
			{
				System.out.println("Password Is Valid");
			}
			else
			{
				throw new InvalidPasswordException("Password Must Contain 1 Uppercase Character 1 LowerCase Characeter 1 Number and 1 special charater(@ , $ , . , _)");
			}
		}
		
		else
		{
			throw new InvalidPasswordException("Password Should Be AtLeast 8 Charecters ");
		}
	}
		catch(InvalidPasswordException i)
		{
			System.err.println(i.getMessage());
		}
	}
	}
}
class User extends Thread
{
	 String password;
	 CheckPassWord cp;
	
	 public User(String password,CheckPassWord cp) {
		super();
		this.password = password;
		this.cp=cp;
	}
	public void run()
	{

		cp.validatePassword(password);
		
	}
	
}

public class Password 
	{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);

		CheckPassWord cp=new CheckPassWord();
		
		System.out.println("Enter Password  ");
		String pass=sc.next();
		
		User u=new User(pass,cp);
		u.start();
		try {
			u.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter Password forThe Second Thread");
		String s=sc.next();
		
		User u1=new User(s,cp);
		u1.start();
		
	}
}
