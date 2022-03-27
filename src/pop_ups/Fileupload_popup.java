package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/vijay/Desktop/New%20folder/uploadfile.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		ele.sendKeys("C:\\Users\\vijay\\Desktop\\New Text Document.txt");
		
		
	}

}
