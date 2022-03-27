package data_driver_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_multiple_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fin = new FileInputStream("./excel/Trail.xlsx");
		Workbook book = WorkbookFactory.create(fin);
		Sheet s = book.getSheet("Sheet1");
		for(int i = 0; i<s.getLastRowNum();i++)
		{
			Row r = s.getRow(i);
			for(int j =0;j<r.getLastCellNum();j++)
			{
				Cell c = r.getCell(j);
				System.out.println(c.toString());
			}
			System.out.println();
			
		}

	}

}
