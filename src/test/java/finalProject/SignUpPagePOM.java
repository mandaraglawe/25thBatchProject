package finalProject;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.SignUpPageObjects;
import resources.BaseClass;


public class SignUpPagePOM extends BaseClass
{
	@Test
	public void signUp() throws IOException, InterruptedException
	{
		driverIntialize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		SignUpPageObjects obj = new SignUpPageObjects(driver);
		obj.enterFirstName().sendKeys("Mandar");
		Thread.sleep(1000);
		
		obj.enterLastName().sendKeys("Aglawe");
		Thread.sleep(1000);
		
		obj.enterEmail().sendKeys("mandaraglawe2000@gmail.com");
		Thread.sleep(1000);
		
		obj.selectjobTitle().click();
		Thread.sleep(1000);
		
		Select s = new Select(obj.selectjobTitle());
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.selectByValue("Developer / Software Engineer");
		Thread.sleep(1000);
		
		obj.enterCompanyName().sendKeys("JSW Steel Ltd.");
		Thread.sleep(1000);
		
		obj.selectEmployeeSize().click();
		Select s2 = new Select(obj.selectEmployeeSize());
		s2.selectByIndex(6);
		Thread.sleep(1000);
		
		obj.enterPhoneNo().sendKeys("9762427224");
		Thread.sleep(1000);
		
		obj.tickCheckBox().click();
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}

}
