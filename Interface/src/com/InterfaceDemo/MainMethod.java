package com.InterfaceDemo;

class MainMethod 
{
  public static void main(String[] args) 
  {
	    Printable p=new Shape("Triangle",12);
		p.printData();
	
		Printable p1=new MyDate(12,10,1996);
		p1.printData();
		
		Printable p2=new Employee(25000,1101,"SaiTeja");
		p2.printData();
}

}
