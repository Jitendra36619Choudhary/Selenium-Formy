package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.base;

public class PageScroll extends base{

	@Test
	public static void PageScrollTest() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div/div/li[11]/a")).click();
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(scroll);
		Thread.sleep(2000);
		scroll.sendKeys("Jitendra Choudhary");
		
		driver.findElement(By.xpath("//*[@id=\"date\"]")).sendKeys("01/01/2090");
		
		Thread.sleep(2000);
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "");
	}
}
