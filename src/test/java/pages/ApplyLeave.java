package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ApplyLeave {
	
	WebDriver driver;
	
	public ApplyLeave(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//xpaths
	
	By LeaveTypes = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
	By comm = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
	
	

	public void toApplyLeave()
	{
		WebElement type=driver.findElement(LeaveTypes);
		
		Select S = new Select(type);
		S.selectByIndex(4);
		

		driver.findElement(comm).sendKeys("Null");
		driver.quit();
		
	}
	
	
	
	
	
}
