package action_CLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RIGHT_class {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	
	//inspect the element where we need to move our cursor
	WebElement target=driver.findElement(By.xpath("//a[text()='Gmail']")); //target ref variable
	
	
	//CREATE OBJECT OF ACTION CLASSS
	Actions act = new Actions(driver);//driver is up comming
	act.contextClick(target).perform();  //contextclick it will 
	
	}
	

}
