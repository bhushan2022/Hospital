package POM;


import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import Utility.Utility;



public class BaseClass {

	static public WebDriver driver; 
	public void openBrowser() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get(Utility.getDataFromPropertiesFile("URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	String Title = driver.getTitle();
	 System.out.println(Title);
	
}
	

}
