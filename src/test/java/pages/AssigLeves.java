package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AssigLeves {
	
	public WebDriver driver;
	
	public AssigLeves(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//xpaths
	
	By EmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
	By LeaveType = By.xpath("//div[@class='oxd-select-text-input']"); // dropdown
	By Comments = By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
	By AssignButton = By.xpath("//button[@type='submit']");
	
	
	
	
	public void assignLeveFillInformation ()throws InterruptedException 
	{
		
		driver.findElement(EmployeeName).sendKeys("Madhuri Takik");
		
		Thread.sleep(3000);
		
		WebElement leave=driver.findElement(LeaveType);
		
		//Select Class
		
		Select s = new Select(leave);
		s.selectByIndex(3);
		
		
		driver.findElement(Comments).sendKeys("NA");
		
	}
	

	public void assignButtonClick()throws InterruptedException 
	{
		
		driver.findElement(AssignButton).click();
	}
	
	
	
}
