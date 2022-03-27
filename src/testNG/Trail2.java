package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Trail2 
{
	@Test(priority=1)
	public void test()
	{
		Reporter.log("SIGNUP", true);
	}
	
	@Test(priority=-3)
	public void test1()
	{
		Reporter.log("CHAT", true);
	}
	@Test(priority=-500)
	public void sample()
	{
		Reporter.log("LOGIN", true);
	}
}
