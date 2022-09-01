package com.seatBooking;

import java.util.Scanner;

class Login
{
	String username;
	String password;
	Scanner sc=new Scanner(System.in);
	
	public void getLogin() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter The Loginid");
		username=sc.next();
		if(username.length()>5)
		{
			System.err.println("InValid UserId");
		}
		else
		{
			System.out.println("Enter The Password");
			password=sc.next();
			if(password.length()>8)
			{
				System.out.println("Login Succesfull");
			}
			else
			{
				System.err.println("InValid Password");
			}
		}
		
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", sc=" + sc + "]";
	}
	
}