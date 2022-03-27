package testNG;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency
{
	@Test(dependsOnMethods="sample")
	public void test()
	{
		Reporter.log("login", true);
	}
	
	@Test(dependsOnMethods="test")
	public void test1()
	{
		Reporter.log("chat", true);
	}
	@Test
	public void sample()
	{
		Reporter.log("signup", true);
	}

}
