package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_actitime 
{
	@Test
	public void test()
	{
	
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		Generic_actitime_login ga = new Generic_actitime_login(driver);
		ga.username();
		ga.password();
		ga.login();
	}
}
