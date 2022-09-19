package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.BaseClass;
import POM.HomePage;

public class TestClass extends BaseClass
{
	WebDriver driver=null;
	HomePage hp;
	@BeforeClass
	public void browserLaunch() throws IOException, InterruptedException
	{
		 openBrowser();
		 hp= new HomePage(driver);
		 Thread.sleep(5000);
	}
	
  @Test
  public void UrlValidate () 
  {
	hp.centresOfExcellence();
	hp.TransPlants();
	hp.organDonation();
	String expectedURL="https://www.apollohospitals.com/organ-donation/";
	String ActualURL= driver.getCurrentUrl();
	Assert.assertEquals(expectedURL, ActualURL);
	Reporter.log("URL is match TC is passed");
	hp.Language();
  }
  @AfterMethod
  public void browserClose()
  {
	  driver.close();
  }
}
