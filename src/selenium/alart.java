package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class alart extends baseclass{

	public static void main(String[] args) throws InterruptedException {
		
		setup("file:///C:/Users/admin/Desktop/Software%20Testing/html%20cods/alertPopUp.html");
		
		/*	methods present in alert 
			//getText()	
			//sendKeys()
			//accept()	ok
			//dismiss()	cancel
		*/
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		Alert a=driver.switchTo().alert();
		
		a.sendKeys("Umesh markad");
		String g=a.getText();
		Thread.sleep(3000);
		
		System.out.println(g);
		Thread.sleep(3000);
		a.accept();
		
		/* down casting 
		 
		long l=9890561444l;
		int i=(int)l;//down casting
		
		*/
		
		
		
	/*	create custom alert pop-up
	 
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("alert('Welcome bro...!');");
		
	 */		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
