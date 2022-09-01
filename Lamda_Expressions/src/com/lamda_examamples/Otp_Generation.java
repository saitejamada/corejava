package com.lamda_examamples;

import java.util.Random;
import java.util.Scanner;

public class Otp_Generation {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); 
		Random r=new Random();
		
		System.out.println("Enter The No Of OTP You Want To Generate");
		int no=sc.nextInt();
		
		for(int i=1;i<=no;i++)
		{
			int otp=r.nextInt(10000);
			System.out.println(i+" Generted Otp IS : "+otp);
		}
	}
}
