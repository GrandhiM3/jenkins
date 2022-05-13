package com.Ecommerce.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseFramework.BaseClass;

public class loginPage extends BaseClass {

	
	static By loginButton = By.xpath("//input[@id='login-button']");
	    
	static By UserName = By.xpath("//input[@id='user-name']");
	
	static By Pw = By.xpath("//input[@id='password']");
	
	public static void EnterUserName(String userName)
	{
		driver.findElement(UserName).sendKeys(userName);
	
}
	
	public static void EnterPassword(String Password)
	{
		driver.findElement(Pw).sendKeys(Password);
	
}
	
	public static void clickLogin()

	{
	driver.findElement(loginButton).click();
}

	
	
	
}
