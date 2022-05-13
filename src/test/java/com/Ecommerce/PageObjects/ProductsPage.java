package com.Ecommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseFramework.BaseClass;

public class ProductsPage extends BaseClass{

	By Backpack = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By TShirt = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
	By Cart = By.cssSelector("div#shopping_cart_container>a");
	
	public void AddTshirt() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(TShirt);
	    action.moveToElement(ele);
	    Thread.sleep(2000);
		driver.findElement(TShirt).click();;
		
	}
	public void AddBackPack()
	{
		driver.findElement(Backpack).click();;
	}
	
	public void gotoCart() throws InterruptedException
	{
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(Cart);
	    action.moveToElement(ele);
	    Thread.sleep(2000);
		driver.findElement(Cart).click();;
	}
	
	
	
}
