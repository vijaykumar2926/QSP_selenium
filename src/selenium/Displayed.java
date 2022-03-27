package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91998/Desktop/3ele.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='t1']"));
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='t2']"));
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='t3']"));
		Thread.sleep(2000);
		ele.sendKeys("Hey");
		Thread.sleep(2000);
		ele1.sendKeys("Hello");
		Thread.sleep(2000);
		ele2.sendKeys("How are you?");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"a");
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"a");
		ele2.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		ele2.sendKeys("Hello");
		Thread.sleep(2000);
		driver.close();
	}

}
