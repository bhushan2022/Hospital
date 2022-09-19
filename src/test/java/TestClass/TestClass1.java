package TestClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestClass1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollohospitals.com/");
		Thread.sleep(5000);
		
//		driver.findElement(By.xpath("(//a[text()='Centres of Excellence'])[1]")).click();
//		Thread.sleep(5000);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(2000));
		WebElement trans = driver.findElement(By.xpath("(//ul[@class='nav nav-tabs asd-catgs vertical-tab tab-arrow tabs']//li)[7]//a[text()='Transplants']"));
		w.until(ExpectedConditions.visibilityOf(trans));
		trans.click();
		
		

	}

}
