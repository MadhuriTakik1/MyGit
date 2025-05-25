package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaukariLogin {
	
	
	public WebDriver driver;
	
	public void NaukariLogin(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By Login1 = By.id("login_Layer");
	By Email_ID = By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
	By Password = By.xpath("//input[@type='password']");
	By Login = By.xpath("//button[@type='submit']");
	
	public void mainLoginButton()
	{
		driver.findElement(Login1).click();
	}
	
		
	public void usernameAndPassword() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(Email_ID).sendKeys("madhuritakik01@gmail.com");
		Thread.sleep(2000);
		driver.findElement(Password).sendKeys("Synechron@24");
	}
	
	public void loginButton()
	{
		driver.findElement(Login).click();
	}

}
