package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_frame_and_enter_data {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		WebElement frameaddress = driver.findElement(By.xpath("//iframe[@class=' lazyloaded']"));
		driver.switchTo().frame(frameaddress);
		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("advanced selenium");
	}

}
