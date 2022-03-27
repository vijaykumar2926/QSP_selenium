package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Generic_facebook 
{
	@FindBy(xpath="//input[@id='email']")
	private WebElement userid;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	@FindBy(xpath="//button[.='Log In']")
	private WebElement login;
	
	public Generic_facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String usr)
	{
		userid.sendKeys(usr);
	}
	public void password(String pass)
	{
		password.sendKeys(pass);
	}
	public void login()
	{
		login.click();
	}
	
}
