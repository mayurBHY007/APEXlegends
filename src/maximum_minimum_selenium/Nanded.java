package maximum_minimum_selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nanded {
	public static void main(String[] args) 
	throws Throwable {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	//maximize
		driver.manage().window().maximize();
	//minimize
		driver.manage().window().minimize();
	//set size
		Dimension d = new Dimension(100, 200);
		driver.manage().window().setSize(d);
	//set position
		Point p = new Point(300,400);
		driver.manage().window().setPosition(p);
		
	}
}

