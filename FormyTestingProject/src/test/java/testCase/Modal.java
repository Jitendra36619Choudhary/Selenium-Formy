package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;

public class Modal extends base{
	
	@Test
	public static void ModalTest() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div/div/li[10]/a")).click();
		driver.findElement(By.id("modal-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("close-button")).click();
	}

}
