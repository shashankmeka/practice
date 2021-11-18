package multiplewindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import selenium.baseclass;

public class multiplewindow extends baseclass{

	public static void main(String[] args) throws InterruptedException {
		setup("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']/following::a[1]")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']/following::a[2]")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']/following::a[3]")).click();
		
		String parentwindow=driver.getWindowHandle();
		Set <String> listwindow=driver.getWindowHandles();
				
		/*	Switching in windows with the help of arraylist
		 
		ArrayList<String> ls= new ArrayList<>(listwindow);
		driver.switchTo().parentFrame();
		
		driver.switchTo().window(ls.get(0));
		Thread.sleep(3000);
		driver.switchTo().window(ls.get(1));
		Thread.sleep(3000);
		driver.switchTo().window(ls.get(2));
		Thread.sleep(3000);
		driver.switchTo().window(ls.get(3));
		Thread.sleep(3000);
		
		*/	
		
		/*	swith to child windows one by one except parent window and capture the title
		 
		for(String list:listwindow) {
			if (!(list.equals(parentwindow))) {
				driver.switchTo().window(list);
				System.out.println(driver.getTitle());
				Thread.sleep(3000);
				
			}}
		 */		
		
		
		/*	Direct swith to parent window
		 
		Thread.sleep(3000);
		driver.switchTo().window(parentwindow);
		
		*/
		
	}
}
