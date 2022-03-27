package pop_ups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clildbrowser_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Click Here']")).click();
		Set<String> alids = driver.getWindowHandles();
		for (String ids : alids) 
		{
			Thread.sleep(2000);
			driver.switchTo().window(ids);
			String url = driver.getCurrentUrl();
			if (url.equals("https://demo.guru99.com/articles_popup.php")) 
			{
				driver.close();
			}
			System.out.println(ids);
		}
		
		
		
	}

}
