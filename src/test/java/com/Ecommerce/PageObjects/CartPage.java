package com.Ecommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseFramework.BaseClass;
import antlr.collections.List;

public class CartPage extends BaseClass {

	
	 By Checkout = By.xpath("//button[@id='checkout']");
	    	
	public  void VerifyCartItems()
	{
		java.util.List<WebElement> ListofCartItems=  driver.findElements(By.xpath("//div[@class='cart_item_label']"));
		int CartSize = ListofCartItems.size();
		System.out.println("No of Items added :"+CartSize);
		if(CartSize==2)
		{
			System.out.println("Cart Items Verified 2 Items added to cart");
		}
		else
		{
			System.out.println("Cart Items Verification failed selected and cart items are not matched");
		}
}
	
	public  void ClickCheckOut() throws InterruptedException
	{
		driver.findElement(Checkout).click();
		Thread.sleep(2000);
}
	

	
	
}
