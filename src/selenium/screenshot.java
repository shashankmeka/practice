package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screenshot extends baseclass {

	public static void main(String[] args) throws IOException {
		
		setup("http://flipkart.com");
		
		/*
		 
			takescreenshot it is interface present in selenium webdriver

		*/
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File loc1=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(loc1, new File("C:\\Users\\admin\\eclipse-workspace\\practice\\Screenshot\\fpk1.png"));
		
		
		driver.close();
		
				
		
		
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		
//		try {
//			FileUtils.copyFile(source,new File("C:\\Users\\admin\\eclipse-workspace\\practice\\Screenshot\\amazon01.png"));
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		
	}
}
