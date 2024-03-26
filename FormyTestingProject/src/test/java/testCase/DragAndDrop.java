package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.base;

public class DragAndDrop extends base {

	@Test
	public static void DragNDroptest() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div/div/li[5]/a")).click();
		Thread.sleep(5000);
		
		WebElement drag = driver.findElement(By.className("ui-widget-content ui-draggable ui-draggable-handle"));
		WebElement drop = driver.findElement(By.className("ui-widget-header ui-droppable"));
		
		Actions actions = new Actions(driver);
//		Actions dragging = actions.clickAndHold(drag);
//		dragging.moveToElement(drop, 0, 444);
//		dragging.release();
//		dragging.build();
//		dragging.perform();
//		actions.dragAndDropBy(drag, 923, 444).build().perform();
		actions.dragAndDrop(drag,drop).build().perform();
		
		Thread.sleep(3000);
	}
}
