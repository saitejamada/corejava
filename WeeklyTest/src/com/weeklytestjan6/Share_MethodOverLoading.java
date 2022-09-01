package com.weeklytestjan6;

import java.util.Scanner;

class Share
{
	public void shareVia(String Blueetooth)
	{
		System.out.println("Sharing Via Bluetooth ");
	}
	
	public void shareVia(int WhatsAppgroup)
	{
		System.out.println("Sharing The data Via WhatsApp Group");
	}
	
	public void shareVia(char gmail)
	{
		System.out.println("Sharaing the data via Gmail ");
	}
	
	public void shareVia(double WhatsappUser)
	{
		System.out.println("Sharing The data Via WhatsApp user");
	}
	
	public void shareVia(char whatsappuser, String WhatsAppUser)
	{
		System.out.println("Sharing The data Via whatsapp user , whatsapp user");
	}
}

public class Share_MethodOverLoading {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Share s=new Share();
		System.out.println("Enter The Option For Sharing ");
		System.out.println("1 bluetooth 2 whatsappgroup 3.gmail 4.whatsapp user 5.whatsapp user,whats app user");
		int option=sc.nextInt();
		
		switch(option)
		{
		case 1:s.shareVia("ab");
				break;
		case 2:s.shareVia(0);
				break;
		case 3:s.shareVia('s');
				break;
		case 4:s.shareVia(1.1);
				break;
		case 5:s.shareVia('s',"s");
			break;
		default : System.out.println("Invalid Option");
		}
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
	}
}
