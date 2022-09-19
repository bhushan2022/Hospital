package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage 
{
	WebDriver driver;
	// Data member
	@FindBy(linkText = "Centres of Excellence")private WebElement COE;
	@FindBy(xpath = "//a[text()='Transplants']")private WebElement Transp;
	@FindBy(xpath = "(//a[text()='Organ Donation'])[1]") private WebElement organD;
	@FindBy(xpath = "//i[@class='fa fa-arrow-down']")private WebElement language;
	
	
	// constructor
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void centresOfExcellence()
	{
		COE.click();
	}
	public void TransPlants()
	{
		Transp.click();
	}
	public void organDonation()
	{
		organD.click();
	}
	public void Language()
	{
		language.click();
		Select s=new Select(language);
		s.selectByIndex(0);
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);
	}
	
	

}
