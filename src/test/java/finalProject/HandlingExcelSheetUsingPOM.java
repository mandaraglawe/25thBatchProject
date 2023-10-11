package finalProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import resources.BaseClass;

public class HandlingExcelSheetUsingPOM extends BaseClass
{
	@Test
	public void loginpage() throws IOException, InterruptedException
	{
		driverIntialize();
		driver.get("https://login.salesforce.com/?locale=in");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Mandar Aglawe\\OneDrive\\Desktop\\HandleExcel.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cellUN = row.getCell(0);
		
		XSSFCell cellPW = row.getCell(1);
		
		LoginPageObject obj = new LoginPageObject(driver);
		
		obj.enterUsername().sendKeys(cellUN.getStringCellValue());
		Thread.sleep(1000);
		
		obj.enterPassword().sendKeys(cellPW.getStringCellValue());
		Thread.sleep(1000);
		
		obj.clickOnLogin().click();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
	}

}
