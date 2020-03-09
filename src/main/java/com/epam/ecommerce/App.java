package com.epam.ecommerce;
import java.util.*;

import com.epam.ecommerce.products.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Scanner input=new Scanner(System.in);
        Data dataObject=new Data();
        Cart itemsCart=new Cart();
        ArrayList< ArrayList <ArrayList <Product> > > ecommerceData=dataObject.getData();
        System.out.println("Welcome to the website");
        int shopAgain=0;
        do
        {
        	int type;
        	int typeOptions=1;
        	for(ArrayList <ArrayList <Product> >TypeArrayList:ecommerceData)
        	{
        		System.out.println(typeOptions+" "+TypeArrayList.get(typeOptions-1).get(0).getProductType());
        		typeOptions=typeOptions+1;
        	}
        	System.out.println("Press -1 to exit");
        	type=input.nextInt();
        	if(type==-1)
        	{
        		break;
        	}
        	if(type<=0 || type>ecommerceData.size())
        	{
        		System.out.println("Invalid Option");
        		continue;
        	}
        	else
        	{
        		int categoryOptions=1,category;
        		for(ArrayList <Product> categoryArrayList:ecommerceData.get(type-1))
        		{
        			System.out.println(+categoryOptions+" "+categoryArrayList.get(categoryOptions-1).getProductCategory());
        			categoryOptions=categoryOptions+1;
        		}
        		System.out.println("Press -1 to exit");
        		category=input.nextInt();
        		if(category==-1)
            	{
            		break;
            	}
            	if(category<=0 || category>ecommerceData.get(type-1).size())
            	{
            		System.out.println("Invalid Option");
            		continue;
            	}
            	else
            	{
            		int itemOptions=1,item;
            		for(Product ProductArrayList:ecommerceData.get(type-1).get(category-1))
            		{
            			System.out.println(itemOptions+" "+ProductArrayList.getProductName());
            			itemOptions=itemOptions+1;
            		}
            		System.out.println("Press -1 to exit");
            		item=input.nextInt();
            		if(item==-1)
            		{
            			break;
            		}
            		else if(item<=0 || item>ecommerceData.get(type-1).get(category-1).size())
            		{
            			System.out.println("Invalid option");
            		}
            		else
            		{
            			System.out.println("The cost of "+ecommerceData.get(type-1).get(category-1).get(item-1).getProductName()+" is "+ecommerceData.get(type-1).get(category-1).get(item-1).getCost());
            			itemsCart.addItemToCart(ecommerceData.get(type-1).get(category-1).get(item-1));
            		}
            	}
        	}
        	itemsCart.showItemInCart();
        	System.out.println("Do you want to shop again press 1 else press 0");
        	shopAgain=input.nextInt();
        	while(shopAgain!=0 && shopAgain!=1)
        	{
        		System.out.println("Invalid option select again");
        		System.out.println("Do you want to shop again press 1 else press 0");
        		shopAgain=input.nextInt();
        	}
        }while(shopAgain!=0);
        System.out.println("Thank you for shopping");
        input.close();
    }
}
