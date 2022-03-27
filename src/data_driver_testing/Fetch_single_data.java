package data_driver_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_single_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//specify excel path
		FileInputStream fis = new FileInputStream("./excel/Trail.xlsx");
		//open excel
		Workbook book = WorkbookFactory.create(fis);
		//specify sheet name
		Sheet s = book.getSheet("Sheet2");
		//specify row number
		Row r = s.getRow(0);
		//specify cell number
		Cell c = r.getCell(0);
		//fetch data
		String value = c.toString();
		System.out.println(value);

	}

}
