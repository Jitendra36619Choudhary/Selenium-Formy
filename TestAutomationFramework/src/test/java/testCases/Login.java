package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.base;
import utilities.ReadXLSdata;

public class Login extends base{

	@Test(dataProviderClass=ReadXLSdata.class, dataProvider="testData")
	public static void LoginTest(String username, String password) throws InterruptedException {
		
		
		driver.findElement(By.className(loc.getProperty("login_btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("user_field"))).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("next_btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("pwd_fild"))).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id(loc.getProperty("login_next_btn"))).click();
		Thread.sleep(5000);
	}
	
//	@DataProvider(name="testData")
//	public Object[][] tData()
//	{
//		return new Object[][]
//		{
//			{"jitendra36619@gmail.com","jitendra_itendra"},
//			{"jitendrachoudhary@gmail.com","	"},
//			{"jitendrachoudhary36619@gmail.com","jitendra_j33_itendra"},
//		};
//	}
}

