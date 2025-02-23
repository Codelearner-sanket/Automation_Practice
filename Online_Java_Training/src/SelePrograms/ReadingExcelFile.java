package SelePrograms;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {
		
		// spacify the location of the file 
		File src=new File("C:\\Users\\sanket umergi\\Downloads\\Project Excel.xlsm");

		//Load File 
		FileInputStream fis = new FileInputStream(src);
		
		// Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// Load worksheet
		XSSFSheet sh = wb.getSheet("RAW DATA");
		
	// print the loaded sheet 
		System.out.println(sh.getSheetName());
	//print 2nd column 2nd row of the string 
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		System.out.println(sh.getRow(2).getCell(1).getNumericCellValue());  // getnumeric -- returns double , float 
		// integer 
		System.out.println((int)sh.getRow(2).getCell(1).getNumericCellValue());  // getnumeric -- returns integer 
		
		// total number of rows 
		System.out.println("Total Rows "+ sh.getPhysicalNumberOfRows());
		
		// 2nd way index 
		System.out.println("Total Rows "+ sh.getLastRowNum());
		
		// number of columns
		System.out.println("Total columns"+ sh.getRow(1).getPhysicalNumberOfCells());
// real time exaple 
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sanket umergi\\\\eclipse-workspace\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String abc =sh.getRow(1).getCell(1).getStringCellValue();
		String abc2=sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(abc);
		driver.findElement(By.id("pass")).sendKeys(abc2);
		
		
		
	}

}
