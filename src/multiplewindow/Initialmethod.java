package multiplewindow;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialmethod {
	
	public static WebDriver driver;
	
	public static void setup() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\javaprogram\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
//	driver.manage().window().maximize();
}
}
