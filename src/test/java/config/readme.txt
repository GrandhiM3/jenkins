short description about this Frame Work.

----->for this i used a maven project. i have added required dependencies in pom.XML

----->Used Tools
Selenium
Java
RestAssuered
Extent Reports
TestNG


----->com.Ecommerce.PageObjects package contains All pageObjects for different pages. 
each page contains required element declarations and required element functionality methods.


----->com.Ecommerce.Option2 package 
contains User Journey(which is asked to automate).we can continue to create more user journeys in this package as required.


----->Config Package
This i created to maintain my config file and constans and readme file.


----->Base Framework Package
in Base class i declared Initate and Teardown methods and i have declared a File reader method and method to read property

----->Reports Package
in this package i have created 2 classes to Genarate reports.(made some own customizations like name).
When ever we run a test case, a extent report will be generated and it will be saved in Extent Reports.
Note:After every run Extent Reports file must be refreshed.(if not we wont get the updated report).
This is HTML report
it should be open with any browser.
it will contain Test Results and Who run the Test, how much time it is taken to complete the details etc.
we can open that in a browser and check results

----->Utilities Package
This package i created to save any kind of Util class that required in feature.
i just created common, Excel, TestData classes.we can store any other classes.
