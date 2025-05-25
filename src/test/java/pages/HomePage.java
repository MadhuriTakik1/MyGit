package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//xpaths on homepage
	
	By Assignleave = By.xpath("//button[@title='Assign Leave']");
	By Applyleave = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-quick-launch-card']");
	
	
	public void assignLeves()throws InterruptedException
	{
		
		driver.findElement(Assignleave).click();
		
	}
	
	public void applyLeave()throws InterruptedException
	{
		driver.findElement(Applyleave);
	}

	
}
