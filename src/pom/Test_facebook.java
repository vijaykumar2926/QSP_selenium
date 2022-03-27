package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_facebook 
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Generic_facebook gfb = new Generic_facebook(driver);
		gfb.username("user123");
		gfb.password("user@321");
		gfb.login();
	}
}
