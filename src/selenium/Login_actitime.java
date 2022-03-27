package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_actitime {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("actiTIME"))
		{
			System.out.println("test case pass");
		}else{
			System.out.println("test case fail");
		}
		driver.close();
		
	}

}
