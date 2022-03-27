package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert_case2 extends Generic
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
		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "actiTIME - Enter Time-Track");
		Reporter.log("test case pass", true);
		s.assertAll();
	}
}
