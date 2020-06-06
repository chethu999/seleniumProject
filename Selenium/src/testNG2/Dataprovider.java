package testNG2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;



public class Dataprovider
{
	@Test
	public Object[][] readData() throws Exception 
	{
		FileInputStream ip= new FileInputStream("G:\\TY Selenium\\Selenium\\src\\testData\\login.xls.xlsx");
		Workbook wb=WorkbookFactory.create(ip);
		Sheet sh=wb.getSheet("registerUserf");
		
		
		 int rowCount=sh.getLastRowNum();
		 int celCount=sh.getRow(0).getLastCellNum();
		 
		 Object[][] data=new Object[rowCount][celCount];
		 
		 //read data from excel
		 for (int i = 0; i <rowCount; i++)
		 {
			for (int j = 0; j < celCount; j++)
			{
				data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
			System.out.println();
		 }
		return data;
	}
	
	@Test(dataProvider = "readData")
	public void addaCart(String FirstName,String Lastname,String Email,String Password,String salary)
	{
		System.out.println(FirstName+""+Lastname+""+Email+""+Password+""+salary);
	}
}