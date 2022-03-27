package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_youtube_like 
{
	public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Peter Parker vs Flash ");
	driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//yt-formatted-string[.='Subscribe']")).click();
	String url = driver.getCurrentUrl();
	System.out.println(url);
	if (url.equals("https://www.youtube.com/watch?v=TcGHKrh8J8I")) 
	{
		System.out.println("url is matching");
	}else{
		System.out.println("url is not matching");
	}
	Thread.sleep(3000);
	driver.close();
	Thread.sleep(2000);
	WebDriver driver1 = new ChromeDriver();
	driver1.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//input[@id='search']")).sendKeys("Peter Parker vs Flash ");
	driver1.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
	Thread.sleep(2000);
	driver1.findElement(By.xpath("//yt-formatted-string[.='Subscribe']")).click();
	Thread.sleep(5000);
	String title = driver1.getTitle();
	System.out.println(title);
	driver1.close();
}

}
