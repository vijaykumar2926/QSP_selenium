package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) 
	{
				String key="webdriver.gecko.driver";
				String value="./softwares/geckodriver.exe";
				System.setProperty(key, value);
				FirefoxDriver ffd = new FirefoxDriver();
				ffd.get("https://www.facebook.com");

	}

}

