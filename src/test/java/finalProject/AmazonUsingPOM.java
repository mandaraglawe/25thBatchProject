package finalProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import PageObjectModel.AmazonPageObjects;
import resources.BaseClass;

public class AmazonUsingPOM extends BaseClass
{
	@Test
	public void Amazon() throws IOException, InterruptedException
	{
		driverIntialize();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		AmazonPageObjects obj = new AmazonPageObjects(driver);
		obj.clickOnAll().click();
		Thread.sleep(1000);
		obj.clickOnElectronics().click();
		Thread.sleep(1000);
	    obj.clickOnCellPhonesAccessories().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		obj.clickOnProduct().click();
		obj.clickOnAddToCart().click();
		Thread.sleep(1000);
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("\\C:\\Users\\Mandar Aglawe\\OneDrive\\Desktop\\ScreenShots\\amazon.png");
		FileUtils.copyFile(source, destination);
		
		
		Thread.sleep(2000);
		driver.quit();
	}
	

}
