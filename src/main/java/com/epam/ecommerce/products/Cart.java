package com.epam.ecommerce.products;
import java.util.*;
public class Cart
{
	private ArrayList<Product> cartList;
	public Cart()
	{
		this.cartList=new ArrayList<Product>();
	}
	public void addItemToCart(Product productBought)
	{
		this.cartList.add(productBought);
	}
	public void showItemInCart()
	{
		System.out.println("Items in the cart are:");
		for(Product itemsInCart:this.cartList )
		{
			System.out.println(itemsInCart.getProductName()+":"+itemsInCart.getCost());
		}
		System.out.println("The Cost of Items in the cart is:"+itemsInCartCost());
	}
	public float itemsInCartCost()
	{
		float totalItemCost=0;
		for(Product itemsInCart:this.cartList )
		{
			totalItemCost+=itemsInCart.getCost();
		}
		return totalItemCost;
	}
}