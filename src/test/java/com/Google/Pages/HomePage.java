/**
 * 
 */
package com.Google.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Google.BaseFunctions.BasePage;

/**
 * @author bvive
 *
 */
public class HomePage extends BasePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void typesearch()
	{
	WebElement email=driver.findElement(By.xpath("//input[@name='q']"));
	typeIn(email,"vivekanadha","Typed in Search Box");
	}
	public void clickOnGoogleSearch()
	{
	WebElement register=driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']"));
	clickOn(register, "Google Search button is clicked");
	}
  

}
