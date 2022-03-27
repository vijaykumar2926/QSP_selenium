package dropdown;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_threeset_desc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vijay/Desktop/New%20folder/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Leela Palace']"));
		TreeSet<String> tre = new TreeSet<String>(Collections.reverseOrder());
		Select sel = new Select(ele);
		List<WebElement> option = sel.getOptions(); 
		for (WebElement texts : option) 
		{
			String text = texts.getText();
			tre.add(text);
		}
		for (String options : tre) 
		{
			System.out.println(options);
		}
		driver.close();
	}

}
