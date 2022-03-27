package dropdown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_remove {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vijay/Desktop/New%20folder/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Leela Palace']"));
		Select sel = new Select(ele);
		List<WebElement> options = sel.getOptions();
		ArrayList<String> array = new ArrayList<String>();
		for (WebElement texts : options) 
		{
			String text = texts.getText();
			array.add(text);
			array.remove("Jolad Roti");
		}
		for (String option : array)
		{
			System.out.println(option);
		}
		driver.close();
	}

}
