package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class doubleclick extends baseclass{
	public static void main(String[] args) {
		setup("https://demoqa.com/buttons");
		
		WebElement doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']/following::button[1]"));
		WebElement click=driver.findElement(By.xpath("//button[@id='doubleClickBtn']/following::button[2]"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(doubleclick).build().perform();
		act.contextClick(rightclick).perform();
		act.click(click).perform();
		
		
		
		
	}
}
