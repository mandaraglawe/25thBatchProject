package finalProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PartialScreenShot 
{
	@Test
	public void partialss() throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		WebElement section = driver.findElement(By.xpath("//div[@id='content']"));
		File source = section.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Mandar Aglawe\\OneDrive\\Desktop\\ScreenShots\\ss2.png");
		FileUtils.copyFile(source, destination);
		
		System.out.println("SS Taken");
		
		driver.quit();
		
		
		
		
		
	}

}
