package com.online_shopping;

abstract class Products
{
	abstract String product();
	abstract String storeItems();
}

class Store
{
	Products p;
	
	public Store(Products p)
	{
		this.p=p;
	}
	
	
	
}

public class Shopping_main {

}
