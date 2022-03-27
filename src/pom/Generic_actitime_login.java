package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Generic_actitime_login 
{
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement pass;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement log_btn;
	
	public Generic_actitime_login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username()
	{
		user.sendKeys("admin");
	}
	public void password()
	{
		pass.sendKeys("manager");
		
	}
	public void login()
	{
		log_btn.click();
	}
}
