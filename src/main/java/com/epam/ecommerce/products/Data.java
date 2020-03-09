package com.epam.ecommerce.products;

import java.util.ArrayList;

public class Data
{
	public ArrayList< ArrayList <ArrayList <Product> > > ecommerceArray;
	public Data()
	{
		ArrayList<Product> shirtsArray=new ArrayList<Product>();
        ArrayList<Product> tShirtsArray=new ArrayList<Product>();
        shirtsArray.add(new Shirts(300,"Tommy Hilfiger"));
        shirtsArray.add(new Shirts(500,"Zaraman"));
        tShirtsArray.add(new TShirts(100,"Levi"));
        tShirtsArray.add(new TShirts(200,"Arrow"));
        
        
        
        ArrayList< ArrayList<Product> > clothesArray=new ArrayList< ArrayList<Product> >();
        clothesArray.add(shirtsArray);
        clothesArray.add(tShirtsArray);
        
        
        
        ArrayList<Product> mobilesArray =new ArrayList<Product>();
        ArrayList<Product> laptopsArray =new ArrayList<Product>();
        mobilesArray.add(new Mobiles(1000,"Apple"));
        mobilesArray.add(new Mobiles(900,"Samsung"));
        laptopsArray.add(new Laptops(2000,"ASUS"));
        laptopsArray.add(new Laptops(3000,"Acer"));
        
        
        ArrayList<ArrayList<Product>> electronicsArray=new ArrayList<ArrayList<Product>>();
        electronicsArray.add(mobilesArray);
        electronicsArray.add(laptopsArray);
        
        
        ArrayList< ArrayList <ArrayList <Product> > > ecommerceArray=new ArrayList< ArrayList <ArrayList <Product> > >();
        ecommerceArray.add(electronicsArray);
        ecommerceArray.add(clothesArray);
        
        this.ecommerceArray=ecommerceArray;
	}
	public ArrayList< ArrayList <ArrayList <Product> > > getData()
	{
		return this.ecommerceArray;
	}
}