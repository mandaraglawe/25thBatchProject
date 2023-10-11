package finalProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleProgramMaven 
{
	@Test
	public void launchURL() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}

}
