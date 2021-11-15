package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class demo1 extends baseclass{
	public static void main(String[] args) throws InterruptedException {
		setup();	
//		driver.get("http://facebook.com");
		
		driver.navigate().to("http://facebook.com");
		
		WebElement wb=driver.findElement(By.id("email"));
		WebElement wb1=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"));
		
		wb.sendKeys("umesh");
		
		System.out.println("attribute method : "+wb.getAttribute("value"));
		
		System.out.println(wb1.getText());
		
		System.out.println("text "+wb.getText());
		
		Thread.sleep(1000);
		driver.navigate().to("http://google.com");
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
	}
}
