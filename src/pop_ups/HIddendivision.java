package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HIddendivision {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@style='min-width: 185px;']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Thu Jan 20 2022']")).click();
		
	}

}
