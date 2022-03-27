package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vijay/Desktop/New%20folder/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Leela Palace']"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.selectByValue("M");
		Thread.sleep(2000);
		sel.selectByVisibleText("Paneer tikka");
		Thread.sleep(1000);
		sel.deselectAll();
		Thread.sleep(2000);
		driver.close();
	}

}
