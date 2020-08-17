package testNG3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excelRead
{
	FileInputStream ip=null;
	@Test
	public void read() throws EncryptedDocumentException, IOException
	{
		
		ip=new FileInputStream("G:\\\\GitHub\\\\VtigerMevan\\\\VtigerNG\\\\src\\\\commanData\\\\product.xlsx");
		Workbook wb=WorkbookFactory.create(ip);
		Sheet sh=wb.getSheet("Org");
		int intRowNum = sh.getLastRowNum();
		short intColNum = sh.getRow(0).getLastCellNum();
		
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		for (int i = 0; i < intRowNum ; i++) 
		{
			for (int j = 0; j < intColNum ; j++)
			{
				System.out.println(sh.getRow(i+1).getCell(j).getStringCellValue());
			}
		}
		
	}
}
