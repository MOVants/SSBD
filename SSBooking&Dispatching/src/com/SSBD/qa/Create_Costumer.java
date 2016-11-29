package com.SSBD.qa;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Create_Costumer {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://172.16.0.47:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
  }

  @Test
  public void CreateCostumer() throws Exception {
    driver.get(baseUrl + "/login?redirectTo=1");
    driver.findElement(By.id("password")).sendKeys("eWXMIoZk");
    driver.findElement(By.id("username")).sendKeys("marvin.villaruel@safesat.com.ph");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Customers")).click();
    driver.findElement(By.linkText("Create New")).click();
    driver.findElement(By.id("customerCode")).sendKeys("OOOFFT");
    driver.findElement(By.id("name")).sendKeys("Marvin Company");
    driver.findElement(By.id("personInCharge")).sendKeys("Marvin Villaruel");
    driver.findElement(By.id("contactNumber")).sendKeys("09126082022");
    driver.findElement(By.id("address")).sendKeys("Jamindan, Capiz");
    driver.findElement(By.id("email")).sendKeys("archaanine@gmail.com");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    Thread.sleep(9000);
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