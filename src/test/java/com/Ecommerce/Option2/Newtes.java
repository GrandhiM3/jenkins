package com.Ecommerce.Option2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Newtes {

    public WebDriver driver;
    @Test
    public void test() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Murali");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Grandhi");
        driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("Grandhim3@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("31");
        driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("3800");
        driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("QA");
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

        Thread.sleep(5000);
        driver.quit();


    






    }

}
