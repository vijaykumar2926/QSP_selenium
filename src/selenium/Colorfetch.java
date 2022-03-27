package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colorfetch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Dimension size = ele.getSize();
		System.out.println(size);
		int h =size.getHeight();
		System.out.println(h);
		int w = size.getWidth();
		System.out.println(w);
		System.out.println(size.width);
		System.out.println(ele.getCssValue("color"));
		driver.close();
		
	}

}
