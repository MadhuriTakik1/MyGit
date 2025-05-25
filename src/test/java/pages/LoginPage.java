package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//xpath
	
	By username= By.xpath("//input[@name='username']");
	By password= By.xpath("//input[@name='password']");
	By loginbtn=By.xpath("//button[@type='submit']");
	
	
	public void enterUsernameAndPassword() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(username).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(password).sendKeys("admin123");
	}
	
	public void loginButtonClick() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.findElement(loginbtn).click();
	}
	

}
