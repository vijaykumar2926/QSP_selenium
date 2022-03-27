package MOUSEHOVER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	Actions act = new Actions(driver);
	act.doubleClick(ele).perform();
	}

}
