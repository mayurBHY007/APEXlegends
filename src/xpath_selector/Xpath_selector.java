package xpath_selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath_selector {
	public static void main(String[] args) 
	throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.actitime.com/login.do");
			 //enter usename(use formula xpath by attribute)
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	 Thread.sleep(3000);
			 //enter password
	 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			 //click on login btn(use formula xpath by text())
	 driver.findElement(By.xpath("//div[text()='Login ']")).click();	
		}
}
 