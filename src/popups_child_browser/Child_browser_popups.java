package popups_child_browser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_popups {
	public static void main(String[]args) throws Throwable {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//open the application
		driver.get("https://www.flipkart.com/");
		
		//click on cancel button
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//search for mobile
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 50000",Keys.ENTER);
		
        //click on mobile
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		 
		//by default selenium is control ids on main window we need take all windows
		
		Thread.sleep(4000);
		Set<String> allwindows = driver.getWindowHandles();
		
	    //using array list we can store all windows sequentially
		Thread.sleep(4000);
		ArrayList<String> al= new ArrayList<String>(allwindows);
		
		//i want to print addres of main window
		String mainwin = al.get(0);
		Thread.sleep(5000);
		System.out.println(mainwin);
		
		//i want to print session id of child window
		String childwin = al.get(1);
		System.out.println(childwin);
		

	}

}
