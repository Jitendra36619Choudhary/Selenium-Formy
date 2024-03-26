package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.base;

public class CompleteForm extends base{
	
	@Test
	
	public static void FormTest() throws InterruptedException {
		
		
		driver.findElement(By.xpath("/html/body/div/div/li[14]/a")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Jitendra");
		driver.findElement(By.id("last-name")).sendKeys("Choudhary");
		driver.findElement(By.id("job-title")).sendKeys("QA Automation Engineer");
		driver.findElement(By.xpath("//*[@id=\"radio-button-3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-1\"]")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"select-menu\"]"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		dropdown.click();
		actions.sendKeys(dropdown, Keys.ARROW_DOWN).perform();
		actions.sendKeys(dropdown, Keys.ARROW_DOWN).perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		
		for(int i=0; i>5; i++) {
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[1]")).click();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[6]/td[7]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
		
		Thread.sleep(2000);
	}

}
