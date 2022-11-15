package action_CLASS;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    //inspect the element where we need to move cursor
    WebElement target = driver.findElement(By.xpath("//a[text()='Gmail']"));
    //create object of actions class
    Actions act=new Actions(driver);
    act.moveToElement(target).doubleClick().perform();


}
	

}
