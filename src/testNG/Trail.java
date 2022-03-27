package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Trail 
{
	@Test
	public void Test()
	{
		Reporter.log("1", true);
	}
	
	@Test
	public void Test1()
	{
		Reporter.log("2", true);
	}
	
	@Test
	public void Sample()
	{
		Reporter.log("3", true);
	}
}
