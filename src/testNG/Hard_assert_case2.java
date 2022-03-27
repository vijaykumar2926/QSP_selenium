package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hard_assert_case2 extends Generic
{
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		Reporter.log(title, true);
		Assert.assertEquals(title, "actiTIME - ");
		Reporter.log("test case pass", true);
	}
}
