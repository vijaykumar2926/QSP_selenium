package data_driver_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_multiple_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./excel/Trail.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		List<WebElement> eles = driver.findElements(By.xpath("//a"));
		for(int i = 0;i<eles.size();i++)
		{
			Row r = s.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(eles.get(i).getAttribute("href"));
		}
		FileOutputStream fout = new FileOutputStream("./excel/Trail.xlsx");
		book.write(fout);
		driver.close();
		
	}

}
