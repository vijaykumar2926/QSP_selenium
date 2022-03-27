package pop_ups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CB_close_allbrowsers {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
	    Set<String> alid = driver.getWindowHandles();
	    for (String allid : alid) 
	    {
			driver.switchTo().window(allid);
			System.out.println(allid);
			Thread.sleep(2000);
			driver.close();
		}
	}

}
