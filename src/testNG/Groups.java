package testNG;

import org.testng.annotations.Test;

public class Groups 
{
	@Test(groups={"smoke","regression"})
	public void sm1()
	{
		System.out.println("I AM SMOKE");
	}
	
	@Test(groups={"smoke","regression"})
	public void sm2()
	{
		System.out.println("I AM SMOKE");
	}
	
	@Test(groups={"system","regression"})
	public void sys1()
	{
		System.out.println("I AM SYSTEM");
	}
	
	@Test(groups={"system","regression"})
	public void sys2()
	{
		System.out.println("I AM SYSTEM");
	}
	
	@Test(groups={"regression"})
	public void reg()
	{
		System.out.println("I AM REGRESSION");

	}
}
