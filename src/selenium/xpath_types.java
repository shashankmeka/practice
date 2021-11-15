package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xpath_types extends baseclass{
	public static void main(String[] args) {
		setup("https://www.travolook.in/?gclid=Cj0KCQiAhMOMBhDhARIsAPVml-HyjTqXEqNFi9Hr_8mgAb-UMEKtzEHV51FbvpuJayclix-8kQVuNo8aAmefEALw_wcB");
		
		String a=driver.getTitle();
		System.out.println(a);
				
		// 1. single attribute	====  //tagname[@attribute='value']
		
		WebElement wb=driver.findElement(By.xpath("//a[text()='Flights']"));
		System.out.println(wb.getText());
		
		//tagname[@attribute='value' and @attribute='value' ]	== 0 + 1 = 0  (two attribute correct then it works)
		//tagname[@attribute='value' or @attribute='value' ]	== 0 + 1 = 1
		
		WebElement wb1=driver.findElement(By.xpath("//*[@id='login_top1' or @class='login login_to']"));
		System.out.println(wb1.getText());
		
		WebElement wb4=driver.findElement(By.xpath("//*[@id=\"Fly_dep_datepickerid\"]/strong/i"));
		wb4.click();
		
		WebElement wb3=driver.findElement(By.xpath("//*[@data-month='10']/following::*[10]"));
		System.out.println(wb3.getText());
		
		
		
		
	}

}
