package com.MethodOverrididng;

class Addfavourites 
{
	
	
 void overload(int a,int b)
 {
	 System.out.println("A Value in int is"+a);
	 System.out.println("B Value in int is"+b);
 }
 
 
 void overload(double a,double b)
 {
	 System.out.println("A Value in double is"+a);
	 System.out.println("B Value in double is"+b);
 }
 
 
 void overload(String a,String b)
 {
	 System.out.println("First String is "+a);
	 System.out.println("Second  String is"+b);
 }
 
 
 void overload(double a,double b,double c)
 {
	 System.out.println("A Value in double is"+a);
	 System.out.println("B Value in double is"+b);
	 System.out.println("C Value in double is"+c);
 }
 
 
 public static void main(String[] args)
 {
	 Addfavourites a=new Addfavourites();
	 
	 a.overload(2, 4);
	 a.overload(2.2, 3.3);
	 a.overload("Sai", "Teja");
	 a.overload(5.5, 6.6, 7.7);
}
}
