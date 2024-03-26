package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;

public class Checkbox extends base{

	@Test
	public static void CheckboxTest() throws InterruptedException {
		// TODO Auto-generated method stub

		driver.findElement(By.xpath("/html/body/div/div/li[3]/a")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.id("checkbox-2")).click();
		driver.findElement(By.id("checkbox-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.id("checkbox-2")).click();
		driver.findElement(By.id("checkbox-3")).click();
		
		
	}

}
