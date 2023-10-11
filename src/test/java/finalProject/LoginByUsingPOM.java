package finalProject;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import resources.BaseClass;

public class LoginByUsingPOM extends BaseClass
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		driverIntialize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		LoginPageObject obj = new LoginPageObject(driver);
		obj.enterUsername().sendKeys("mandaraglawe2000@gmail.com");
		obj.enterPassword().sendKeys("mandar123");
		obj.clickOnLogin();
		Thread.sleep(1000);
		
	}

}
