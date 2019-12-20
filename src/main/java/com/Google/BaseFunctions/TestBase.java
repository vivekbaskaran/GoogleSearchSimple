package com.Google.BaseFunctions;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class TestBase {
	public static WebDriver driver;

	@BeforeMethod
	public void testMethodSetup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void testMethodCleanup() {
		driver.close();
		driver.quit();
	}
}
