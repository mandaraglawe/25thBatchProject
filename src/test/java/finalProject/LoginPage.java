package finalProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.BaseClass;

public class LoginPage extends BaseClass
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		driverIntialize();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Get Data from excelSheet
		
		FileInputStream fis=new FileInputStream("\\C:\\Users\\Mandar Aglawe\\OneDrive\\Desktop\\HandleExcel.xlsx\\");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		XSSFCell cell1 = row.getCell(1);
		System.out.println(cell1.getStringCellValue());
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='Login']"));
		
		Thread.sleep(1000);
		
		username.sendKeys(cell.getStringCellValue());
		password.sendKeys(cell1.getStringCellValue());
		
		Thread.sleep(1000);
		
		loginbutton.click();
		Thread.sleep(1000);
		
		driver.quit();
		System.out.println("Code Run Succesfully");
		
		
	}

	
	
}
