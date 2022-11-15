package customized_list_box;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Customized_list {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//click on create new account button
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	//[2]isiye liya hai bcz tag name same thw nd 2nd pr create button ka code tha so [2] liye
	
    //select month
    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
    //crete object of actions class
  Actions act=new Actions(driver);
  //click on month
  act.click(month).perform();
  //move upside by one
  act.sendKeys(Keys.ARROW_UP).perform();
  //move on step down
  act.sendKeys(Keys.ARROW_DOWN).perform();
  //click on october
  act.sendKeys(Keys.ENTER).perform();
}	
	}


