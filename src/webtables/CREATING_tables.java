package webtables;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


public class CREATING_tables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\User\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/User/OneDrive/Desktop/NOTES/AUTOMATION/how%20to%20create%20table/data%20for%20web%20table.html");
	    //print only student name
	    String sn = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
	    System.out.println(sn);
	    
	    //print city
	    String ct = driver.findElement(By.xpath("//table[@id='2244']//th[3]")).getText();
	    System.out.println(ct);
	    
	    //print sr no
	    String sern = driver.findElement(By.xpath("//table[@id='2244']//th[1]")).getText();
	    System.out.println(sern);
	    
	    //print ashwini
	    String ashwini = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[2]")).getText();
	    System.out.println(ashwini);
	    
	    
	    
	    //print samiksha
	    String samiksha = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[11]")).getText();
	    System.out.println(samiksha);
	    
	    //print row2
	    String r2 = driver.findElement(By.xpath("//table[@id='2244']//tr[2]")).getText();
	    System.out.println(r2);
	    
	    //print row5 
	    String r5 = driver.findElement(By.xpath("//table[@id='2244']//tr[5]")).getText();
	    System.out.println(r5);
	    

	    

	
	}
}
