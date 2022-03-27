package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickcbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91998/Desktop/New%20folder/cbox.html");
		List<WebElement> ele = driver.findElements(By.xpath("//input"));
		for (WebElement cbox : ele) 
		{
			cbox.click();
			Thread.sleep(2000);
		}
	}

}
