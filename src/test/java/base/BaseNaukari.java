package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import pages.NaukariLogin;

public class BaseNaukari {
	
	public WebDriver driver;
	public NaukariLogin Nlogin;
	
	
	@BeforeSuite
	
	public void launchNaukariApp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		
	}
	
	
	

}
