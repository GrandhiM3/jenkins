package com.Ecommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseFramework.BaseClass;

public class OrderConfirmationPage extends BaseClass {

	
	 By ConfirmationMessage = By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]");
	    
		
	public  void VerifyOrderConfirmation(String OrderCon)

	{
		String ConMessage = driver.findElement(ConfirmationMessage).getText();
		
		if(ConMessage.equalsIgnoreCase(OrderCon))
		{
			System.out.println("ORDER PLACED SUCCESSFULLY "+ ConMessage);
		}
		else {
			System.out.println("ORDER Not PLACED Please Try Again");
		}
}	
	
	
	
}
