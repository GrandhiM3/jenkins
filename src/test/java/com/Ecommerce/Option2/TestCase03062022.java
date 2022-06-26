package com.Ecommerce.Option2;

import com.Ecommerce.PageObjects.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseFramework.BaseClass;

@Listeners(Reports.ExtentList.class)
public class TestCase03062022 extends BaseClass{
    @Test (priority = 1, description = "Launch Appilication")
    public void openAppilication() throws InterruptedException {
        BaseClass.launchBrowser();
    }
    @Test(priority = 2, description = "Click Add Button" )
        public void ClickaddBtn(){

        WebTablePage.ClickAddButton();
    }
    @Test(priority = 3, description = "Enter Details")
    public void EnterDetails() throws InterruptedException {
            WebTablePage.EnterDetails("Murali","Grandhi","grandhim3@gmail.com","31","82000","QE");
            Thread.sleep(5000);
    }
    @Test(priority = 4, description = "Click Submit Button")
    public void Clicksubmitbtn() throws InterruptedException {
        WebTablePage.ClickSubmitButton();
        Thread.sleep(5000);
    }
    @Test(priority = 5, description = "Verify the is added or not")
    public void VerifyAction(){
        WebTablePage.Verify();
    }
    @Test (priority = 6, description = "Closing The Browser")
    public void QuitBrowser() {
        BaseClass.closeBrowser();

    }

}
