package dynamic_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WORLDOmeter_ratio {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://www.worldometers.info/coronavirus/country/india/");
		
	//print coronavirus cases
		//print Coronavirus Cases
		String cases=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
		System.out.println(cases);
		
		//print death cases
		String death=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
		System.out.println(death);
			
		//print recover cases
		String recoverd = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		System.out.println(recoverd);
		System.out.println("we are still in danger\n please wear mask");
	}

}
