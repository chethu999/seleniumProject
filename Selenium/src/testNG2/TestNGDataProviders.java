package testNG2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviders
{
	@Test(dataProviderClass = TestData.class , dataProvider = "data",priority = 1)
	public void registerUser(String firstname,
							String lastname,
							String email,
							String psd)
	{
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
		System.out.println(psd);
	}
	
	@Test(dataProviderClass = TestData.class , dataProvider = "data",priority = 2)
	public void Login(String email,String psd)
	{

		System.out.println(email);
		System.out.println(psd);
	}
	
	
//	@DataProvider
//	public Object[][] TestData()
//	{
//		Object[][] obj=new Object[3][4];
//		obj[0][0]="rahul";
//		obj[0][1]="r";
//		obj[0][2]="rahul@g ail";
//		obj[0][3]="rahul1";s
//		
//				obj[1][0]="rahul";
//				obj[1][1]="rahul11d";
//				obj[1][2]="rahuls";
//				obj[1][3]="rahul5436 ";
//						obj[2][0]="rahuldff";
//						obj[2][1]="rahulff";
//						obj[2][2]="rahulff";
//						obj[2][3]="rahulf5313";
//								
//		return obj;
//	}
}
