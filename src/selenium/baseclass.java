package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	static WebDriver driver;
	
	public static void setup(String url){
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
}
}