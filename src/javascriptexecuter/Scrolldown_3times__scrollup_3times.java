package javascriptexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown_3times__scrollup_3times {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for(int i=0;i<3;i++)
		{
			jse.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);
		}
		for(int j=0;j<3;j++)
		{
			jse.executeScript("window.scrollBy(0,-300)");
			Thread.sleep(2000);
		}
	}

}
