package testCase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.base;

public class SwitchWindow extends base {

	@Test
	public static void WindowTest() throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div/div/li[13]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"new-tab-button\"]")).click();

		Set<String> window = driver.getWindowHandles();

		Iterator<String> iterator = window.iterator();
//		String parent = iterator.next();
//		String child = iterator.next();

		Thread.sleep(2000);

		while (iterator.hasNext()) {
			String parent = iterator.next();
			String child = iterator.next();
			driver.switchTo().window(child);

			Thread.sleep(3000);
			driver.close();
			driver.switchTo().window(parent);
		}

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"alert-button\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
	}

}
