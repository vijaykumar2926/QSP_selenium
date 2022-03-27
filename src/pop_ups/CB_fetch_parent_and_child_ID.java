package pop_ups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CB_fetch_parent_and_child_ID {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
	    String pid = driver.getWindowHandle();
	    Set<String> alid = driver.getWindowHandles();
	    System.out.println(pid);
	    System.out.println("------------------------------------------------------------");
	    for (String allid : alid) 
	    {
			System.out.println(allid);
		
		}
		
	}

}
