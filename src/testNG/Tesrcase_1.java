package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tesrcase_1 extends Generic
{
	@Test
	public void test()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
}
