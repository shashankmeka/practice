package multiplewindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import selenium.baseclass;

public class multiplewindow2 extends baseclass {
	
	public static boolean reqwindow(String wtitle, List<String> hlist) {
		for(String e:hlist) {
			String pagetitle=driver.switchTo().window(e).getTitle();
			if(pagetitle.contains(wtitle)) {
				System.out.println("page is found... ");
				return true;
			}}
		return false;
		}
	
	
	public static void switchinparent(String parent) throws InterruptedException {
		driver.switchTo().window(parent);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("alert('This is parent window');");
		Thread.sleep(4000);
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	
	public static void closewindow(String parent, List<String> hlist) throws InterruptedException {
		for(String e:hlist) {
			if(!(e.contains(parent))) {
				System.out.println("Title of this window : "+driver.getTitle());
				Thread.sleep(2000);
				driver.switchTo().window(e).close();
			}}
	}
	public static void main(String[] args) throws InterruptedException {
		
		setup("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']/following::a[1]")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']/following::a[2]")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']/following::a[3]")).click();
		
		String parent=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		List<String> hlist=new ArrayList<String>(handles);
		
		//switch in parent window
		switchinparent(parent);
		Thread.sleep(4000);
					
		/*	Switch in required window 
		if(reqwindow("Facebook", hlist)) {
			System.out.println(driver.getTitle());
		}
		*/		
		
		/*	close child windows
		closewindow(parent, hlist);
		*/
		
		Thread.sleep(5000);
		System.out.println("Successfully done... ");
		driver.quit();
	}

}
