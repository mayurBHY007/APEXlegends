package popup_notification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\User\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		//create objesct of browser setting class
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		
		//open the browser
		WebDriver driver =new ChromeDriver(c); //here if c is not pass then notification will be apper
		//else if c is pass here then notification will not be shown
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com");
		
}
}
