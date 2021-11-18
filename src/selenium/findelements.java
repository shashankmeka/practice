package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findelements extends baseclass {
	public static void main(String[] args) {
		
		setup("http:amazon.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		List<WebElement> images=driver.findElements(By.tagName("img"));
		
		System.out.println("Totle links on page : " +links.size());
		System.out.println("Totle links on page : " +images.size());
		
		
		//	print all links in console
		
		for(WebElement a:links) {
			
			System.out.println(a.getText());
		}
		
		
		driver.quit();
		
	}

}
