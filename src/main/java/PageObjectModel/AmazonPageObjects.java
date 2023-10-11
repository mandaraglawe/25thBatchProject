package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonPageObjects 
{
	WebDriver driver;
	private By all = By.xpath("//i[@class='hm-icon nav-sprite']");
	private By Electronics = By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a/i");
	private By cellPhonesAccessories = By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[6]/a");
	private By product = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div[2]/div[1]/h2/a/span");
	private By addToCart = By.xpath("//*[@id=\"add-to-cart-button\"]");
	public AmazonPageObjects(WebDriver driver2) 
	{
		this.driver = driver2;
		
	}

	public WebElement clickOnAll()
	{
		return driver.findElement(all);
		
	}
	
	public WebElement clickOnElectronics()
	{
		return driver.findElement(Electronics);
		
	}
	
	public WebElement clickOnCellPhonesAccessories()
	{
		return driver.findElement(cellPhonesAccessories);
		
	}
	
	public WebElement clickOnProduct()
	{
		return driver.findElement(product);
		
	}
	
	public WebElement clickOnAddToCart()
	{
		return driver.findElement(addToCart);
		
	}
	
	
	
	
	

}
