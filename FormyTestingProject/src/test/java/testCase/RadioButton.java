package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;

public class RadioButton extends base {

	@Test
	public static void RadioTest() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div/div/li[12]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div/div[2]/input")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/input")).click();
	
		Thread.sleep(1000);
	}
}
