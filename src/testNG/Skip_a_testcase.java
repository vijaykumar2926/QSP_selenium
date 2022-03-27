package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skip_a_testcase 
{
	@Test(enabled=true)
	public void test()
	{
		Reporter.log("login", true);
	}
	
	@Test(enabled=false)
	public void test1()
	{
		Reporter.log("chat", true);
	}
	@Test(enabled=true)
	public void sample()
	{
		Reporter.log("signup", true);
	}
}
