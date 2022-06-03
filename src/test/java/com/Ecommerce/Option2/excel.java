package com.Ecommerce.Option2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class excel {
    public static void main(String[] args) throws IOException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        //tr means Row, this table has 7 rows including Header
        ///td means Column, this table has 3 columns

        //*[@id="customers"]/tbody/tr[2]/td[1]
        //*[@id="customers"]/tbody/tr[7]/td[1]
        //Notice above the pattern, only the values are changing for tr[??]- which is why we will break it down into 2 String
        //below and then concatinate them as String

        String beforeXpath_Company = "//*[@id='customers']/tbody/tr["; // changed customer to single quote
        String aferXpath_Company = "]/td[1]";  //Company is column 1

        String beforeXpath_Contact = "//*[@id='customers']/tbody/tr[";
        String aferXpath_Contact = "]/td[2]";  // Contact is column 2

        String beforeXpath_Country = "//*[@id='customers']/tbody/tr[";
        String aferXpath_Country = "]/td[3]";  // Country is column 3

        //Find number of rows so that we do not use hard coded values
        List<WebElement> totalRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        int rows=totalRows.size();



        for (int i = 2; i <rows; i++) {  //we start from 2 because  1 is column name
            String actualXpath = beforeXpath_Company + i + aferXpath_Company;
            String companyName = driver.findElement(By.xpath(actualXpath)).getText();
            System.out.println(companyName);

            String actualXpath_Contact = beforeXpath_Contact + i + aferXpath_Contact;
            String contactName = driver.findElement(By.xpath(actualXpath_Contact)).getText();
            System.out.println(contactName);

            String actualXpath_Country = beforeXpath_Country + i + aferXpath_Country;
            String countryName = driver.findElement(By.xpath(actualXpath_Country)).getText();
            System.out.println(countryName);

            //Try to following to write to an Excel file in C drive
            Workbook wb = new XSSFWorkbook();
            CreationHelper createHelper = wb.getCreationHelper();
            Sheet sheet1 = wb.createSheet("Sheet1");

            Row row = sheet1.createRow(i);
            Cell cell = row.createCell(i);
            cell.setCellValue(createHelper.createRichTextString(companyName));

            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\test.xlsx");
            wb.write(fileOut);
            fileOut.close();
        }
        driver.close();
    }

}


