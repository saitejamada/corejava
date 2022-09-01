package com.employee;

public class Number
{
	int number,fact=1,square,reverseOfNumber=0,sumOfDigit=0;
	
	Number(int number)
	{
		this.number=number;
	}
		boolean isZero()
		{
		if(number==0)
			return true;
				return false;
		}
		
		
		boolean isPositive()
		{
		    if(number>0)
			return true;
			 return false;
		}
			
			
			
		boolean isNegative()
		{
			if(number<0)
				return true;
					return false;
		}
				
				
				
		boolean isOdd()
		{
			if(number%2!=0)
			  return true;
			   return false;
		}
					
					
		boolean isEven()
		{
			if(number%2==0)
				return true;
					return false;
		}
						
						
		boolean isPrime()
		{
			for(int i=1;i<number;i++)
			{
				if(number%i==0)
				{
					return false;
				}
								
			}
		  return true;
		}
						
		boolean isArmstrong()
		{
			int number1=number,sumOfNumber=0;
			  while(number1>0)
			  {
				int quotient=number1%10;
				  number1=number1/10;
					sumOfNumber+=quotient*quotient*quotient;
			  }
			  if(number==sumOfNumber)
				return true;
			  else
			   return false;
		}
		
		int getFactorial()
		{
			
		  for(int i=1;i<number;i++)
		  {
			  fact=fact*i;
		  }
		  return fact;
		}
		
		int getSqr()
		{
			square=number*number;
			return square;
		}
		
		int getSumOfdigits()
		{
			int number1=number;
			while(number1>0)
			{
				int quotient=number1%10;
				sumOfDigit+=quotient;
				number1=number1/10;
			}
				return sumOfDigit;
		}
		
		int getreverseOrder()
		{ 
			int number1=number;
			 while(number1>0)
		     {
				 reverseOfNumber=(reverseOfNumber*10)+number1%10;
				 number1=number1/10;
		     }
			 	return reverseOfNumber;
		}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			
		Number n=new Number(12);
		
		System.out.println("The Given number 12 is Zero  "+n.isZero());
		System.out.println("The Given number 12 is Postive or not  "+n.isPositive());
		System.out.println("The Given number 12 is Negative  or not  "+n.isNegative());
		System.out.println("The Given number 12 is Even or not  "+n.isEven());
		System.out.println("The Given number 12 is Odd or not  "+n.isOdd());
		System.out.println("The Given number 12 is Armstrong  or not  "+n.isArmstrong());
		System.out.println("The Given number 12 is Prime or not  "+n.isPrime());
		System.out.println("The Given number 12 And Factorial of Number is "+n.getFactorial());
		System.out.println("The Given number 12 And Sum Of Digits of Number is "+n.getSumOfdigits());
		System.out.println("The Given number 12 And Reverse  of Number is "+n.getreverseOrder());
		System.out.println("The Given number 12 And Square of Number is "+n.getSqr());
		
		
		
		
		
		
		
	}

}
