package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Foreachexercise 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		for (WebElement links : ele) 
		{
			String text = links.getText();
			System.out.println(text);
		}
		
	}

}
