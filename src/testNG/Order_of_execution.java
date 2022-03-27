package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Order_of_execution extends Generic
{
	@Test
	public void test()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@Test
	public void sample()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='L']")).click();
	}
}
