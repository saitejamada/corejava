package com.lamda_examamples;

import java.util.function.Predicate;

@FunctionalInterface
interface Cubei
{
	int cube(int n);
}
@FunctionalInterface
interface Number
{
	int no(int a,int b);
}

public class Cube {

	public static void main(String[] args) {

		Cubei c=(n)->n*n*n;
		int cube=c.cube(5);
		System.out.println("Cube is of 5 is "+cube);
		
		Cubei c1=(n)->n*n;
		int sq=c1.cube(6);
		System.out.println("Square is of 6 is "+sq);
		
		Cubei c2=(n)->(int)Math.PI*n*n;
		int area=c2.cube(5);
		System.out.println("area Of circle  with radius 5 is"+area);
		
		Number num=(a,b)->2*(a+b);
		int per=num.no(5, 6);
		System.out.println("Perimeter of rectangle with length 5 width 6 is "+per);
		
		Predicate<Integer> a=(i)->i%2==0;
		if(a.test(6)==true)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		
		}
}
