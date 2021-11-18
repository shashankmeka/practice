package multiplewindow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.baseclass;

public class htmltable extends baseclass{
	public static WebElement table;
	
	
	public static void rowcount() {
		//count table row
		List<WebElement> ls1=table.findElements(By.tagName("tr"));
		int row=ls1.size();
		System.out.println("Total rows are : "+row);
		System.out.println();
		
		//print all row 
		for(WebElement abc:ls1) {
			
			
			String rows=abc.getText();
			if(rows.contains("May"))
					{
				System.out.println("************It's present**************");
			}
			System.out.println(rows);
	
		}
		
	}
	
	public static void headcount() {
		//count table head
				List<WebElement> ls2=table.findElements(By.tagName("th"));
				System.out.println("Total head in table : "+ls2.size());
				
		//print all head
				for(WebElement abc:ls2) {
					System.out.println(abc.getText());
				}
	}
	
	
	public static void cellcount() {
		//count table cell
		List<WebElement> ls3=table.findElements(By.tagName("td"));
		System.out.println("Total cell in table : "+ls3.size());
		
//print all cell
		for(WebElement abc:ls3) {
			System.out.println(abc.getText());
		}
}
		
	
	
	
	
	public static void main(String[] args) {
		setup("file:///C:/Users/admin/Desktop/Software%20Testing/html%20cods/table.html");
		
		
		//create instance of table		
		table=driver.findElement(By.xpath("/html/body/table"));
		
		rowcount();
		System.out.println("=============================================================");
		headcount();
		System.out.println("=============================================================");
		cellcount();
		
		
		
		
		
		
		
		driver.quit();
		
	}
}
