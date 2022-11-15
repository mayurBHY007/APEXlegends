package find_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_handling {
public static void main(String[] args) {
	 System.setProperty("webDriver.chrome.driver","C:\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\User\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  int count =0;
  driver.get("https://www.freepik.com/");
  List<WebElement> Elements = driver.findElements(By.xpath("//div"));
  for(WebElement i:Elements)
  {
	  String str=i.getText();
	  System.out.println(str);
	  count++;
  }
  System.out.println(count);

}
}
