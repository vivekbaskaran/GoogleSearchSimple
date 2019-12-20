package com.Google.TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Google.BaseFunctions.TestBase;
import com.Google.Pages.HomePage;;

public class LoginTest extends TestBase {

	com.Google.Pages.HomePage homePage;

	@Test
	public void testlogin() throws InterruptedException {
		homePage = new HomePage(driver);
		homePage.typesearch();
		homePage.clickOnGoogleSearch();

	}
}
