package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Feachingsource {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		String src =driver.getPageSource();
		System.out.println(src);
		driver.close();
	
		WebDriver driver1 = new FirefoxDriver();
		Thread.sleep(2000);
		driver1.get("https://www.twitter.com");
		Thread.sleep(2000);
		String title1 = driver1.getTitle();
		System.out.println(title1);
		String URL1 = driver1.getCurrentUrl();
		System.out.println(URL1);
		String src1 =driver1.getPageSource();
		System.out.println(src1);
		driver1.close();
		
		WebDriver driver2 = new ChromeDriver();
		Thread.sleep(2000);
		driver2.get("https://www.amazon.com");
		Thread.sleep(2000);
		String title2 = driver2.getTitle();
		System.out.println(title2);
		String URL2 = driver2.getCurrentUrl();
		System.out.println(URL2);
		String src2 =driver2.getPageSource();
		System.out.println(src2);
		driver2.close();

		WebDriver driver3 = new FirefoxDriver();
		Thread.sleep(2000);
		driver3.get("https://www.flipkart.com");
		Thread.sleep(2000);
		String title3 = driver3.getTitle();
		System.out.println(title3);
		String URL3 = driver3.getCurrentUrl();
		System.out.println(URL3);
		String src3 =driver3.getPageSource();
		System.out.println(src3);
		driver3.close();
		

	}

}
