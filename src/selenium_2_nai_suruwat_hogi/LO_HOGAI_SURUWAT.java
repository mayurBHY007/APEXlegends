package selenium_2_nai_suruwat_hogi;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LO_HOGAI_SURUWAT {
	
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
         WebDriver driver = new ChromeDriver() ;
        
 
          /*driver.get("https://www.whatsappimages.in/shinchan-whatsapp-dp-images/");
          driver.manage() .window() .maximize() ;// to maximize
           Thread.sleep(3000);
           
          driver.manage().window().minimize();// to minimize
          Thread.sleep(3000);
           
          
          Dimension d = new Dimension(500, 500);
       
          
          driver.manage().window().setSize(d); // set size 
          Thread.sleep(3000);
          
          Point p = new Point(400,500);
          driver.manage().window().setPosition(p);*/
          
          
         /* driver.get("https://www.amazon.in/");
          String link = driver.getCurrentUrl();
          System.out.println(link);
          Thread.sleep(2000);
          
          String page = driver.getPageSource();
          System.out.println(page);
          Thread.sleep(3000);*/
         
    
        driver.get("https://www.amazon.com/");
        String allelements = driver.getPageSource();
        System.out.println(allelements);
        String title = driver.getTitle();
        System.out.println(title);
	
	}
}
