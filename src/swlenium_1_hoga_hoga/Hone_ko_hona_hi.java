package swlenium_1_hoga_hoga;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hone_ko_hona_hi {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankush\\Downloads\\chromedriver_win32 (9)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    //maximize
	    driver.manage().window().maximize();
	    
	    //minize
	    Thread.sleep(3000);
	   // driver.manage().window().minimize();
	    
	    //setsize()
	   // Dimension d=new Dimension(100,200);
	   // driver.manage().window().setSize(d);
	    
	    
	    //setposition
	    Point p=new Point(300,400);
	    driver.manage().window().setPosition(p);

	
	}
}
