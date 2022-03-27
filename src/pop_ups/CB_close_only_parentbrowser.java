package pop_ups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CB_close_only_parentbrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
	    String pid = driver.getWindowHandle();
	    Set<String> alid = driver.getWindowHandles();
	    for (String allid : alid) 
	    {
			if (allid.equals(pid)) 
			{
				System.out.println(allid);
				driver.close();
			}
		}
	}

}
