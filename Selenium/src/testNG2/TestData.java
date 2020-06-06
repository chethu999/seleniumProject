package testNG2;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.excel.utility.Xls_Reader;

public class TestData
{
	@DataProvider(name= "data")
	public static Object[][] TestData(Method m)
	{
		//to get the test data from excel
		int count=0;
		Xls_Reader reader=new Xls_Reader("G:\\TY Selenium\\Selenium\\src\\testData\\login.xls.xlsx");
		int rowCount = reader.getRowCount("registerUserf");
		int colCount=reader.getColumnCount("registerUserf");
		
		Object[][] obj=null;
		if (m.getName().equals("registerUser"))
		{
			obj=new Object[3][4];
			obj[0][0]="rahul";
			obj[0][1]="r";
			obj[0][2]="rahul@g ail";
			obj[0][3]="rahul1";
			
			obj[1][0]="rahul";
			obj[1][1]="rahul11d";
			obj[1][2]="rahuls";
			obj[1][3]="rahul5436 ";
			
			obj[2][0]="rahuldff";
			obj[2][1]="rahulff";
			obj[2][2]="rahulff";
			obj[2][3]="rahulf5313";
			String firstname;
//			String lastname;
//			String email;
//			String password;
//			for (int row= 2; row<=rowCount; row++)
//			{
//				count++;
//				firstname=reader.getCellData("registerUserf", "FirstName", row);
//				lastname=reader.getCellData("registerUserf", "LastName", row);
//				email=reader.getCellData("registerUserf"," Eamil", row);
//				password=reader.getCellData("registerUserf", "Password", row);
//			}
//			for (int i = 0; i <rowCount ; i++)
//			{
//				for (int j = 0; j <colCount; j++)
//				{
//					obj[i][j]=firstname;
//					obj[0][1]="r";
//					obj[0][2]="rahul@g ail";
//					obj[0][3]="rahul1";
//				}
//			}
//			
		}
		if (m.getName().equals("Login")) 
		{
			obj=new Object[3][2];
			obj[0][0]="rahul@g ail";
			obj[0][1]="rahul1";
			
			obj[1][0]="rahuls";
			obj[1][1]="rahul5436 ";
			
			obj[2][0]="rahulff";
			obj[2][1]="rahulf5313";
		}						
		return obj;
	}
}
