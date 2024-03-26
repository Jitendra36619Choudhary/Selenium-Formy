package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;


public class Autocomplete extends base {

	@Test
	public static void AutoTest() throws InterruptedException {
		// TODO Auto-generated method stub

		driver.findElement(By.xpath("/html/body/div/div/li[1]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("House. no. 1, gurgaon");
		Thread.sleep(3000);
		driver.findElement(By.className("dismissButton")).click();
		driver.findElement(By.id("street_number")).sendKeys("XYZ");
		driver.findElement(By.id("locality")).sendKeys("Gurgaon");
		driver.findElement(By.id("administrative_area_level_1")).sendKeys("Haryana");
		driver.findElement(By.id("postal_code")).sendKeys("123456");
		driver.findElement(By.id("country")).sendKeys("India");
		
		System.out.println("Autosomplete files success");
	}

}
