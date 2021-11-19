package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouseAction extends baseclass {

	public static void main(String[] args) throws InterruptedException {
		
		setup("https://paytm.com/bus-tickets");
		
		WebElement wb=driver.findElement(By.linkText("Paytm for Consumer"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(wb).perform();		//moveToElement 
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
			
		WebElement wb1=driver.findElement(By.id("nav-link-accountList"));
		
		act.moveToElement(wb1).perform();
//=============================================================================================================		
		
		Thread.sleep(3000);
		WebElement wb2=driver.findElement(By.linkText("Your Orders"));
		
		act.click(wb2).perform();		// click on perticular webelement
		
		
		
	}

}
