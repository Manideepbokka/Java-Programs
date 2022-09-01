package com.java.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
	List<Product> l2=getProducts().stream().filter(product->product.getPrice()>30).collect(Collectors.toList());
	l2.forEach(System.out::println);	

	}
	public static List<Product> getProducts()
	{
		List<Product> pds=new ArrayList<>();
		pds.add(new Product(1,"Chocolates",65));
		pds.add(new Product(2,"Biscuits",30));
		pds.add(new Product(3,"Apples",100));
		pds.add(new Product(4,"Grapes",100));	
		return pds;
	}

}
class Product
{
	private int id;
	private String name;
	private float price;
	public Product(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}