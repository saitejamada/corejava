package com.shoppingmall;

import java.util.List;

interface Costumer
{
	String getName(String name);
	int getId(int id);
	int getMobile(int no);
	String getAddress(String address);
	int getPin(int pin);
}

interface Store
{
	List<String> getProducts(String product);
}

public class Shoppingmall {

}
