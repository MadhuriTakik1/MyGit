package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class LoginTestCase extends BaseClass{

	@Test
	public void toVerifyLoginUsingCorrectCredentials() throws InterruptedException {
		
		login.enterUsernameAndPassword();
		login.loginButtonClick();
		
		page.assignLeves();
		
		leaves.assignLeveFillInformation();
		leaves.assignButtonClick();
		
		apply.toApplyLeave();
		
	}
}
