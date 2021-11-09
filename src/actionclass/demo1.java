package actionclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import multiplewindow.Initialmethod;

public class demo1 extends Initialmethod{
public static void main(String[] args) {
	setup();
//	Dimension d=new Dimension(1000,500);
//	driver.manage().window().setSize(d);
	
	driver.get("https://www.facebook.com");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(source,new File("C:\\Users\\admin\\eclipse-workspace\\practice\\Screenshot\\fb_01.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
