package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public static WebDriver driver; //Declaring driver as a global variable
	public void driverIntialize() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Mandar Aglawe\\eclipse-workspace\\25thbatchFinalProject\\src\\main\\java\\resources\\data.properties");
		
		Properties prop =  new Properties();
		
		prop.load(fis);
		
		String BrowserName = prop.getProperty("browser"); // Used to load the value stored in data.properties
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("edge"))
		{
			 driver = new EdgeDriver();
			
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please Check You have mentioned correct browser");
		}
	}
	

}
