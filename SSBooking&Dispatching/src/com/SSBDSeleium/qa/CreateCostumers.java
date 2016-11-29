package com.SSBDSeleium.qa;


import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class CreateCostumers extends SSMBDSForms {
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
	  public void creatCostumer() throws Exception {
	    driver.get(baseUrl + "/login?redirectTo=1");
	    toLogin();
	    toCostumerMngtTab();
	    tocreateCostumer();
	    driver.findElement(By.xpath(saveBtn)).click();
	    driver.findElement(By.xpath(confirmbtn)).click();
}
private void toLogin() {
	driver.findElement(By.id(password)).sendKeys("eWXMIoZk");
	driver.findElement(By.id(usrname)).sendKeys("marvin.villaruel@safesat.com.ph");
	driver.findElement(By.cssSelector(loginBtn)).click();
}

private void toCostumerMngtTab() {
	driver.findElement(By.linkText(costumersTab)).click();
}

private void tocreateCostumer() {
	driver.findElement(By.linkText(createCostumer)).click();
	driver.findElement(By.id(costumerCode)).sendKeys("00000001");
	driver.findElement(By.id(companyName)).sendKeys("Marvin corp.");
	driver.findElement(By.id(prsnIChrge)).sendKeys("Marvin Villaruel");
	driver.findElement(By.id(contactNo)).sendKeys("09126082022");
	driver.findElement(By.id(address)).sendKeys("Jamindan, Capiz");
	driver.findElement(By.id(email)).sendKeys("archaanine@gmail.com");
}


@After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	private void fail(String verificationErrorString) {
	// TODO Auto-generated method stub
	
}

	public boolean isAcceptNextAlert() {
		return acceptNextAlert;
	}

	public void setAcceptNextAlert(boolean acceptNextAlert) {
		this.acceptNextAlert = acceptNextAlert;
	}
}