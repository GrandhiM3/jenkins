package com.Ecommerce.Option2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class excel_new {
    public static void main(String[] args) throws IOException {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");


        //*[@id="customers"]/tbody/tr[1]/th

     List<WebElement> rows =  driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
     System.out.println(rows.size());
     int rowsize = rows.size();

     List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[3]/td"));
     System.out.println(cols.size());
     int colsize = cols.size();

     for(int i=2;i<=rowsize;i++) {
         FileOutputStream fileOut = null;
         Workbook wb = new XSSFWorkbook();
         CreationHelper createHelper = wb.getCreationHelper();
         Sheet sheet1 = wb.getSheet("Sheet1");
         for (int j = 1; j <= colsize; j++) {
             Row row = sheet1.createRow(i);
             Cell cell = row.createCell(j);
             cell.setCellValue(createHelper.createRichTextString(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText()));

             System.out.print(driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+ i +"]/td["+ j +"]")).getText()+"----");
             fileOut = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\test.xlsx");
             wb.write(fileOut);

         }
         fileOut.close();
     }

     driver.close();


    }


}
