package calenderHandle;

import org.testng.annotations.Test;

public class CalenderDemo5 
{
	@Test
	public void name()
	{
		String dob="09/07/1996";
				String[] date = dob.split("/");
				System.out.println(date[0]);
				System.out.println(date[1]);

				System.out.println(date[2]);}
}
