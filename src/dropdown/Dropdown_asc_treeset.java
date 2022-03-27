package dropdown;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_asc_treeset {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vijay/Desktop/New%20folder/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Leela Palace']"));
		TreeSet<String> array1 = new TreeSet<String>();
		Select sel = new Select(ele);
		List<WebElement> option = sel.getOptions();
		for (WebElement text : option) 
		{
			String altext = text.getText();
			array1.add(altext);
		}
		for (String sorted : array1) 
		{
			System.out.println(sorted);
		}
		driver.close();
	}

}
