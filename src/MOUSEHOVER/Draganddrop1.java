package MOUSEHOVER;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement norway = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement seoul = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement south_korea = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement unitedstates = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(rome, italy).perform();
		Thread.sleep(2000);
		act.dragAndDrop(madrid, spain).perform();
		Thread.sleep(2000);
		act.dragAndDrop(oslo, norway).perform();
		Thread.sleep(2000);
		act.dragAndDrop(copenhagen, denmark).perform();
		Thread.sleep(2000);
		act.dragAndDrop(seoul, south_korea).perform();
		Thread.sleep(2000);
		act.dragAndDrop(stockholm, sweden).perform();
		Thread.sleep(2000);
		act.dragAndDrop(washington, unitedstates).perform();

	}

}
