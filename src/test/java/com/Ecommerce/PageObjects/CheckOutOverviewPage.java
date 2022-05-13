package com.Ecommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseFramework.BaseClass;

public class CheckOutOverviewPage extends BaseClass {

	
	 By FinishButton = By.xpath("//button[@id='finish']");
	    
	 By ItemTotal = By.xpath("//div[text()='Item total: $']");
	 
	public  void ClickFInish()

	{
		driver.findElement(FinishButton).click();
}	
	
	public  void VerifyItemTotalAmount(String ExpectedAmount)

	{
		String actualAmount = driver.findElement(ItemTotal).getText();
		
		if(actualAmount.contains(ExpectedAmount))
		{
			System.out.println("Item Total matched as per catelog. Total Amount is "+ actualAmount);
		}
		else {
			System.out.println("Item Total not matched as per catelog. Total Amount is "+ actualAmount);
		}
}	
	
	
	
}
