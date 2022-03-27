package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vijay/Desktop/New%20folder/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Leela Palace']"));
		Select sel = new Select(ele);
		List<WebElement> option = sel.getOptions();	
		for (WebElement text : option) 
		{
			String altext = text.getText();
			System.out.println(altext);
			
		}
		Thread.sleep(2000);
		driver.close();
	}

}
