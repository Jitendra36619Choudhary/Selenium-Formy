package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;

public class DatePicker extends base {

	@Test
	public static void DatePickTest() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div/div/li[4]/a")).click();
		driver.findElement(By.id("datepicker")).click();

		for (int i = 1; i <= 4; i++) {

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[1]")).click();
		}

		for (int i = 1; i <= 20; i++) {

			driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[3]")).click();
		}

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[3]")).click();
		
		Thread.sleep(2000);
	}
}
