package testCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;

public class FileUpload extends base{

	@Test
	public static void Upload() throws InterruptedException, IOException, AWTException {
		
		driver.findElement(By.xpath("/html/body/div/div/li[8]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/form/div/div/span[1]/button")).click();
		
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_W);
		r.keyPress(KeyEvent.VK_PERIOD);
		r.keyPress(KeyEvent.VK_J);
		r.keyPress(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_G);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		
	    
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button")).click();
		Thread.sleep(2000);
		
	}
}
