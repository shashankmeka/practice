package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class clickandhold extends baseclass{
	public static void main(String[] args) throws InterruptedException {
		setup("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement Washington=driver.findElement(By.id("box3"));
		WebElement Stockholm=driver.findElement(By.id("box2"));
		WebElement Copenhagen=driver.findElement(By.id("box4"));
		WebElement w=driver.findElement(By.id("box5"));
		
		
		WebElement US=driver.findElement(By.id("box103"));
		WebElement denmark=driver.findElement(By.id("box104"));
		WebElement Sweden=driver.findElement(By.id("box102"));
		Actions act=new Actions(driver);
		
		
		act.dragAndDrop(Copenhagen, denmark).perform();
		Thread.sleep(2000);
		act.dragAndDrop(Washington, US).perform();
		Thread.sleep(2000);
		act.dragAndDrop(Stockholm, Sweden).perform();
		Thread.sleep(2000);
		
		act.clickAndHold(w).perform();			//keep pressing button
		
		
		
	}
}
