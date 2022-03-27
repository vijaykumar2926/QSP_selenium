package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple_times 
{
	@Test(invocationCount=4)
	public void test()
	{
		Reporter.log("login", true);
	}
	
	@Test(invocationCount=8)
	public void test1()
	{
		Reporter.log("chat", true);
	}
	
	@Test(invocationCount=12)
	public void sample()
	{
		Reporter.log("signup", true);
	}
}
