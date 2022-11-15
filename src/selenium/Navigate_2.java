package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_2 {
public static void main(String[] args) 
	throws Throwable {
		
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://wwww.amazon.com");
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.navigate().forward();
		
		driver.get("https://www.w3schools.com/");
		Thread.sleep(3000);
	     driver.navigate().back();
	     
	     driver.navigate().refresh();
		
}
}
