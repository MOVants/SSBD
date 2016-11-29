package com.SSBD.qa;

//

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Create_Booking {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

@Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    baseUrl = "http://172.16.0.47:8080/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test123() throws Exception {
	
    driver.get(baseUrl + "/login?redirectTo=1");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("marvin.villaruel@safesat.com.ph");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("eWXMIoZk");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Create New")).click();
    driver.findElement(By.id("cargoDetails_totalWeight")).clear();
    driver.findElement(By.id("cargoDetails_totalWeight")).sendKeys("123");
    driver.findElement(By.id("otherBookingDetails_specialRequest")).clear();
    driver.findElement(By.id("otherBookingDetails_specialRequest")).sendKeys("I am legend");
    driver.findElement(By.cssSelector("body > div > div > div > div > div.col-xs-12.col-sm-12.col-md-9.col-lg-9 > form > div:nth-child(4) > div > button")).click();
    driver.findElement(By.xpath("(//input[@name='selectCustomer'])[4]")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.cssSelector("li > button.btn.btn-info")).click();
    driver.findElement(By.linkText("12312")).click();
    driver.findElement(By.linkText("daqw")).click();
    driver.findElement(By.cssSelector("button.btn.btn-default")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[20]")).click();
    driver.findElement(By.cssSelector("span.glyphicon.glyphicon-chevron-up")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[23]")).click();
    driver.findElement(By.xpath("//ssbd-time-picker[@id=\"'expectedDeliveryTime'\"]/table/tbody/tr/td/a/span")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//button[2]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

public boolean isAcceptNextAlert() {
	return acceptNextAlert;
}

public void setAcceptNextAlert(boolean acceptNextAlert) {
	this.acceptNextAlert = acceptNextAlert;
}
}