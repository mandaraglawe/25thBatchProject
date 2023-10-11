package finalProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingExcelSheet 
{
	@Test
	public void m1() throws IOException, InterruptedException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\Mandar Aglawe\\OneDrive\\Desktop\\HandleExcel.xlsx");
		// FileInputStream obj_Name = new FileInputStream(file_path);  --> Add throws declaration
		//Used to locate a file on system // also add \ <--
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		// XSSFWorkbook obj_name = new XSSFWorkbook(obj_name of FileInputStream);
		//Used to get inside the workbook  // --> Add throws exception (IOexception)
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		// XSSFSheet sheet_name = work_bookname.getSheetAt(int index); index 0 = sheet 1
		// Used to navigate to the desired sheet inside the workbook
		
		XSSFRow row = sheet.getRow(0); // index 0= row 1
		// XSSFRow row_name(user def) = sheet_name.getRow(int index);
		//Used to get to the desired row inside the sheet.
		
		XSSFCell cell_1 = row.getCell(0); 
		// XSSFCell cell_name = row_name.getCell(int index);
		//USed to get to the desired cell in a row.
		
		XSSFCell cell_2 = row.getCell(1);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='username']"));
		UserName.click();
		UserName.sendKeys(cell_1.getStringCellValue());
		
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.click();
		Password.sendKeys(cell_2.getStringCellValue());
		// cell.getStringCellValue(); --> Used to get data inside a cell
		
		
		WebElement Login = driver.findElement(By.id("Login"));
		Login.click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}
		
	

}
