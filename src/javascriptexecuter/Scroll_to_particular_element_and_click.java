package javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_to_particular_element_and_click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[.='About Us']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		ele.click();
	}
}
