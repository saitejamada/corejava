package com.mokito_examples;

public class Calculator {

	CalculatorService service;

	public Calculator(CalculatorService service) {
		super();
		this.service = service;
	}

	public int performAdd(int a,int b)
	{
		return service.add(a, b);
	}
	public int performSub(int a,int b)
	{
		return service.sub(a, b);
	}
	public int performMul(int a,int b)
	{
		return service.mul(a, b);
	}
	public int performDiv(int a,int b)
	{
		return service.div(a, b);
	}
}
