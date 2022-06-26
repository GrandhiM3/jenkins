package com.Ecommerce.PageObjects;

import BaseFramework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTablePage extends BaseClass {

    static By Add_Button =By.xpath("//*[@id=\"addNewRecordButton\"]");
    static By FirstName = By.xpath("//*[@id=\"firstName\"]");
    static By LastName = By.id("lastName");
    static By email = By.id("userEmail");
    static By age =By.id("age");
    static By salary = By.id("salary");
    static By department =By.id("department");
    static By submitbtn = By.id("submit");

    static By nametext = By.xpath("//div[text()='Murali']");



    public static void ClickAddButton(){
        driver.findElement(Add_Button).click();
    }

    public static void EnterDetails(String Firstname, String Lastname, String emailInput, String ageInput, String Salary, String dept){

        driver.findElement(FirstName).sendKeys(Firstname);
        driver.findElement(LastName).sendKeys(Lastname);
        driver.findElement(email).sendKeys(emailInput);
        driver.findElement(age).sendKeys(ageInput);
        driver.findElement(salary).sendKeys(Salary);
        driver.findElement(department).sendKeys(dept);
    }

    public static void ClickSubmitButton(){

        driver.findElement(submitbtn).click();
    }

    public static void Verify(){
        String Act = driver.findElement(nametext).getText();
        String Exp = "apple";


        Assert.assertEquals(Act,Exp);

    }
}
