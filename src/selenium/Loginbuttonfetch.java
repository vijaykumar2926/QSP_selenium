package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginbuttonfetch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[@name='login']"));
		String text = ele.getText();
		System.out.println(text);
		if (text.equals("Log In")) {
			System.out.println("test case pass");
		}else{
			System.out.println("test case fail");
		}
		driver.close();
	}

}
