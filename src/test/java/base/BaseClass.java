package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.ApplyLeave;
import pages.AssigLeves;
import pages.HomePage;
import pages.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage login;
	public HomePage page;
	public AssigLeves leaves;
	public ApplyLeave apply;
	
	@BeforeSuite
	public void launchAppliation() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	//object creation
	
	@BeforeClass
	public void objCreation() {
		login=new LoginPage(driver);
		page = new HomePage(driver);
		leaves = new AssigLeves(driver);
		apply = new ApplyLeave(driver);
		
	}	

}
