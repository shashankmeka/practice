package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xpath_types2 extends baseclass{
public static void main(String[] args) throws Throwable {
	setup("https://www.facebook.com/reg/");
	
	
	//following xpath (move forward)
	
	WebElement wb=driver.findElement(By.xpath("//input[@name='firstname']/following::input[2]"));
	wb.sendKeys("9890561444");
	System.out.println(wb.getAttribute("value"));
		
	
	// Preceding xpath(move backword)
	
	WebElement wb2=driver.findElement(By.xpath("//input[@name='reg_email__']/preceding::input[2]"));
	wb2.sendKeys("Yashraj");
	System.out.println(wb2.getAttribute("value"));
	
	//contains   ===  //tagname[contains(@attribute,'value')]
	
	WebElement wr=driver.findElement(By.xpath("//*[contains(@id,'password_step_input')]"));
	wr.sendKeys("gavhane");
	System.out.println(wr.getAttribute("value"));
	
	//contains combine with text
	
	driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
	
	
	}
}
