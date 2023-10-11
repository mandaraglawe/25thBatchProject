package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects 
{
	WebDriver driver;
	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By lastName = By.xpath("//input[@name='UserLastName']");
	private By email = By.xpath("//input[@name='UserEmail']");
	private By jobTitle = By.xpath("//select[@name='UserTitle']");
	private By companyName = By.xpath("//input[@name='CompanyName']");
	private By companyEmployees = By.xpath("//select[@name='CompanyEmployees']");
	private By phoneNo= By.xpath("//input[@name='UserPhone']");
	private By checkBox = By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	public SignUpPageObjects(WebDriver driver2) 
	{
		this.driver = driver2;
		
	}

	public WebElement enterFirstName()
	{
		return driver.findElement(firstName);
		
	}
	
	public WebElement enterLastName()
	{
		return driver.findElement(lastName);
		
	}
	
	public WebElement enterEmail()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement selectjobTitle()
	{
		return driver.findElement(jobTitle);
	}
	
	public WebElement enterCompanyName()
	{
		return driver.findElement(companyName);
		
	}
	
	public WebElement selectEmployeeSize()
	{
		return driver.findElement(companyEmployees);
		
	}
	
	public WebElement enterPhoneNo()
	{
		return driver.findElement(phoneNo);
	}
	
	public WebElement tickCheckBox()
	{
		return driver.findElement(checkBox);
	}
	

}
