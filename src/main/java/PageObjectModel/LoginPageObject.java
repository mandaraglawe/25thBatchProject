package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject 
{
	public static WebDriver driver; //Declaring driver as global variable
	
	private By username = By.xpath("//input[@id='username']"); /* Declaring username as a
	                                                           private variable*/
	public LoginPageObject(WebDriver driver2) 
	{
		this.driver = driver2;
	}

	public WebElement enterUsername()
	{
		return driver.findElement(username);
		
	}
	
	private By password = By.xpath("//input[@id='password']");
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
		
	}
	
	private By loginButton = By.xpath("//input[@id='Login']");
	
	public WebElement clickOnLogin()
	{
		return driver.findElement(loginButton);
		
	}
	                                                            

}
