package screenshot;


 	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.google.common.io.Files;

	public class Screenshot_taken {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	  //  driver.get("https://www.google.com/");
	    driver.get("https://www.facebook.com/"); 
	    
	    //find particular element and store ref varaible
	  //  WebElement paarticulr = driver.findElement(By.xpath("//img[@class='lnXdpd']")); 
	  //  WebElement particular = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
	 WebElement particular = driver.findElement(By.xpath("//form[@class=\"_9vtf\"]"));
	    
	    
	  File src = particular.getScreenshotAs(OutputType.FILE);
	   File dest=new File("E:\\screenshot folder//.jpg");
	   Files.copy(src, dest);
	}
	}


