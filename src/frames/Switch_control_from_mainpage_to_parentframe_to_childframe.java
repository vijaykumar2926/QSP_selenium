package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_control_from_mainpage_to_parentframe_to_childframe {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(0);
		String text = driver.findElement(By.xpath("//p[.='Child Iframe']")).getText();
		System.out.println(text);
		driver.close();

	}

}
