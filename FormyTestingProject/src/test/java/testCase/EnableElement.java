package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;

public class EnableElement extends base{
	
	@Test
	public static void EnableNDisable() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div/div/li[7]/a")).click();
		
		driver.findElement(By.id("disabledInput")).click();
		System.out.println("Disable button pressed");
		Thread.sleep(2000);
		driver.findElement(By.id("input")).sendKeys("Jitendra Choudhary");
		Thread.sleep(2000);
		
	}

}