package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class multiwindowhandle extends baseclass{
	
	public static void alert() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('This is parent window');");
		Thread.sleep(4000);
		Alert a=driver.switchTo().alert();
		a.accept();
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		setup("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']/following::a[1]")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']/following::a[2]")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']/following::a[3]")).click();
		
		
		String parentwindow=driver.getWindowHandle();	//parent window store in one variable
		Set<String> tabs=driver.getWindowHandles();		//all windows store here
		
		System.out.println(parentwindow);				//print parent window id
		driver.switchTo().window(parentwindow);			//switch in parent window
		alert();
		
//======================================================================================================================================
		/*
		System.out.println("totle windows open : "+tabs.size());	//all window count
		
		ArrayList <String> al=new ArrayList<>(tabs);				
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.switchTo().window(al.get(2));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.switchTo().window(al.get(3));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.switchTo().window(al.get(4));
		System.out.println(driver.getCurrentUrl());
		*/
//======================================================================================================================================
		
		for(String x:tabs) {
			
			if(!(x.equals(parentwindow))) {
				
				driver.switchTo().window(x);
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(3000);
				
			}
		}
		
//======================================================================================================================================
			
		Thread.sleep(4000);
//		driver.quit();
	}

}
