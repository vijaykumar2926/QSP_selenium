package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Trail1 
{
	@Test
	public void test()
	{
		Reporter.log("test", true);
	}
}
