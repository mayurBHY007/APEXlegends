package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_A {
	public static void main(String[]args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");	
	
	/* //maximize the browser
	    driver.manage().window().maximize();
	    //switch to first frame
	    driver.switchTo().frame("packageListFrame");
	    //take any element on first frame and print it
	    String text1 =driver.findElement(By.xpath("//a[text()='org.openqa.selenium.cli']")).getText();
	    System.out.println(text1);
	    
	    //switch to 2nd frame
	    Thread.sleep(4000);
	    driver.switchTo().frame("packageFrame");
	    //take any element on 2nd frame and print it
	    Thread.sleep(4000);
	    String text2=driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	    Thread.sleep(4000);
	    System.out.println(text2);
	    
	    //go to 3rd frame
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("classFrame");
	    //take any ele and print
	    String txt3 =driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
	    System.out.println(txt3);
	    */
	
	//maximze the browser
	driver.manage().window().maximize();
	
	
	//switch to 1st frame
	driver.switchTo().frame("packagelistframe");
	
	//take any elements on 1st frame and print it
	String text1=driver.findElement(By.xpath("//a[text()='org/openqa/selenium/chrome/package-frame.html']")).getText();
	System.out.println(text1);
			
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
	}


