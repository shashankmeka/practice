package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class frameshandle extends baseclass{
	public static void main(String[] args) throws InterruptedException {
		
//		setup("http://demo.guru99.com/test/guru99home/");
		
		/*
		 
		setup("https://demoqa.com/frames");
		List <WebElement> l=driver.findElements(By.tagName("iframe"));
		System.out.println("no. of frames : "+l.size());
		
		*/		
//		setup("https://ui.cogmento.com/");		
			
		
		setup("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
//		count no. of frames in page
		
		List <WebElement> l=driver.findElements(By.tagName("iframe"));
		System.out.println("no. of frames : "+l.size());

//		================================================
		
		
		driver.switchTo().frame(2);
		driver.findElement(By.linkText("org.openqa.selenium.docker")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium.concurrent")).click();
		
	
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.quit();
		
	}

}
