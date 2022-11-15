package upstock_framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF_upstock {
	
	public static void main(String[]args)   {
		
		//set he propeties
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	
	// to give implicit wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	
	//now to delete all cookies
	driver.manage().deleteAllCookies();
	
	//to maximize the browser
	driver.manage().window().maximize();
	
	//to open the application
	driver.get("https://login-v2.upstox.com/");
	
	
	}
	
	

}
