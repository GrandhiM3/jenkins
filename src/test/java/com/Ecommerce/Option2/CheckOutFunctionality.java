package com.Ecommerce.Option2;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Ecommerce.PageObjects.CartPage;
import com.Ecommerce.PageObjects.CheckOutOverviewPage;
import com.Ecommerce.PageObjects.CheckOutProfilePage;
import com.Ecommerce.PageObjects.OrderConfirmationPage;
import com.Ecommerce.PageObjects.ProductsPage;
import com.Ecommerce.PageObjects.loginPage;

import BaseFramework.BaseClass;

@Listeners(Reports.ExtentList.class)
public class CheckOutFunctionality extends BaseClass{

	
	loginPage lpage = new loginPage();
	ProductsPage products = new ProductsPage();
	CartPage cpage = new CartPage();
	CheckOutProfilePage COpage = new CheckOutProfilePage();
	CheckOutOverviewPage cOverViewpage = new CheckOutOverviewPage();
	OrderConfirmationPage OCpage = new OrderConfirmationPage();
	
	
	String filepath = System.getProperty("user.dir")+"//src//test//java//config//config.properties";

	 @Test (priority = 1, description = "Launch Appilication")
	public void openAppilication() throws InterruptedException {
		BaseClass.launchBrowser();
	 }
	 @Test (priority = 2, description = "Enter UserName")
	public void EnterUsername() {
		loginPage.EnterUserName("standard_user");
	}
	 @Test (priority = 3, description = "Enter Password")
	public void EnterPassword() throws InterruptedException {
		loginPage.EnterPassword("secret_sauce");
		Thread.sleep(5000);
	}
	 @Test (priority = 4, description = "Click Login")
	public void clickLogin() throws InterruptedException {
		loginPage.clickLogin();
		Thread.sleep(5000);
	}
	 
	 @Test (priority = 5, description = "Add Tshirt")
		public void AddTshirttoCart() throws InterruptedException {
			products.AddTshirt();
			Thread.sleep(5000);
		}
	 
	 @Test (priority = 6, description = "Add BackPack")
		public void AddBackpacktoCart() throws InterruptedException {
			products.AddBackPack();
			Thread.sleep(5000);
		}
	 
	 @Test (priority = 7, description = "Go to Cart")
		public void GotoCart() throws InterruptedException {
			products.gotoCart();
			Thread.sleep(5000);
		}
	 
	 
	 @Test (priority = 8, description = "Cart Items Verification")
		public void CartItemsVerification() throws InterruptedException {
			cpage.VerifyCartItems();
		}
	 
	 @Test (priority = 9, description = "Click CheckOut")
		public void checkOut() throws InterruptedException {
			cpage.ClickCheckOut();
		}
	 
	 @Test (priority = 10, description = "Enter Customer Details")
		public void EnterCustomerDetails() throws InterruptedException {
			COpage.EnterFirstName("Murali");
			Thread.sleep(1000);
			COpage.EnterLastName("Grandhi");
			Thread.sleep(1000);
			COpage.EnterZipCode("1686");
			Thread.sleep(2000);
		}
	 
	 @Test (priority = 11, description = "Click Continue Button")
		public void ClickContinue() throws InterruptedException {
			COpage.ClickContinue();
			Thread.sleep(5000);
		}
	 

	 @Test (priority = 12, description = "Verify Item Total")
		public void ItemTotal() throws InterruptedException {
			cOverViewpage.VerifyItemTotalAmount("37.98");
			
		}
	 
	 @Test (priority = 13, description = "Finish the Order")
		public void FinishOrder() throws InterruptedException {
			cOverViewpage.ClickFInish();
			Thread.sleep(2000);			
		}
	 
	 @Test (priority = 14, description = "Order Confirmation")
		public void orderConfirmation() throws InterruptedException {
			OCpage.VerifyOrderConfirmation("Thank you for your Order");
			Thread.sleep(2000);
		}
	 
	 @Test (priority = 15, description = "Closing The Browser")
	public void QuitBrowser() {
		BaseClass.closeBrowser();
		
	}
			
	}
