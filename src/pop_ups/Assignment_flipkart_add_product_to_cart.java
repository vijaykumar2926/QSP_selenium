package pop_ups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_flipkart_add_product_to_cart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value=''])[2]")).sendKeys("9986292637");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1475369vijay");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("nike shoes");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-id='SHOGY7Q7ZRQXBTGY']")).click();
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> arry = new ArrayList<String>(ids);
		String child = arry.get(1);
		driver.switchTo().window(child);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='9']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		/*Thread.sleep(2000);
	    driver.close();
		Thread.sleep(2000);
		String parent = arry.get(0);
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		Thread.sleep(5000);
		driver.close();*/
		
		

	}

}
