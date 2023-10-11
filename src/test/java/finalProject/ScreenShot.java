package finalProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot 
{
	@Test
	public void captureScreenShot() throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bcci.tv/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File Source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Mandar Aglawe\\OneDrive\\Desktop\\ScreenShots\\ss.png");
		FileUtils.copyFile(Source, destination);
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
	}

}
