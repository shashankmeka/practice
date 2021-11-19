package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class keyboardactions extends baseclass{
	
	public static void main(String[] args) {
		
		setup("https://www.facebook.com/login/");
		
		Actions act=new Actions(driver);
		
		WebElement wb=driver.findElement(By.id("email"));
		wb.click();
		
		act.keyDown(Keys.SHIFT).sendKeys("breejmohan pyare").keyUp(Keys.SHIFT).build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys("6384634").sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
		.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		
	}
}
