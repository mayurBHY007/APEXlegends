
package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chromedriver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        
 
          driver.get("https://www.whatsappimages.in/shinchan-whatsapp-dp-images/");
          driver.manage().window().maximize();   // to maximize
           Thread.sleep(3000);
           
          driver.manage().window().minimize();// to minimize
            
          
          Dimension d = new Dimension(200, 300);
          
          driver.manage().window().setSize(d);  // set size 



	
}
}
