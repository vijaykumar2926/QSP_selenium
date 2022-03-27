package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic 
{
  WebDriver driver;
  @BeforeMethod
  public void open()
  {
	  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://localhost/login.do");
  }
  
  @AfterMethod
  public void close()
  {
	  driver.close();
  }
}
