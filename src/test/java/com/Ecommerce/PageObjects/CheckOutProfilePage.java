package com.Ecommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseFramework.BaseClass;

public class CheckOutProfilePage extends BaseClass {

	
	 By FirstName = By.xpath("//input[@id='first-name']");
	    
	 By LastName = By.xpath("//input[@id='last-name']");
	
	 By ZipCode = By.xpath("//input[@id='postal-code']");
	 
	 By ContinueButton = By.xpath("//input[@id='continue']");
	
	public  void EnterFirstName(String FName)
	{
		driver.findElement(FirstName).sendKeys(FName);
	
}
	
	public  void EnterLastName(String LName)
	{
		driver.findElement(LastName).sendKeys(LName);
	
}
	
	public  void EnterZipCode(String ZCode)

	{
		driver.findElement(ZipCode).sendKeys(ZCode);
}

	public  void ClickContinue()

	{
		driver.findElement(ContinueButton).click();
}	
	
	
}
