package popups1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pops {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
 //enter customer id
		 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("makbhoyar",Keys.ENTER);
		 
		 //use alert interface
		 Alert alt = driver.switchTo().alert();
		 
		 //i want to click on ok button
		// alt.accept();
		 //automatically ok buton will be clicked
		 //click on cancled button
		// alt.dismiss();
		 
		 //get the text on popup
		 String text = alt.getText();
		 System.out.println(text); 
		 
		 
		 

	
	
	
	
	
	
	}

}
