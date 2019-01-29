package com.volvo.mfg.pagecomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.volvo.mfg.commonutilis.CommonWrapperMethods;

public class LoginPages extends CommonWrapperMethods {
	
	private WebDriver driver;
	
	

	
	public LoginPages(WebDriver driver) {
		this.driver = driver;
	}
	
	public void LogintoIDNE(String uName,String pWord,String eValue) throws InterruptedException {
		
		
		
			
				// Entering the credentials and click submit
				
		sendKeys("UserName", By.xpath(prop.getProperty("LoginPage.User.Name")), uName);
		sendKeysPassword("Password", By.xpath(prop.getProperty("LoginPage.User.Password")), pWord);
		anyClick("Submit", By.xpath(prop.getProperty("LoginPage.Login.Button")));
				reportStep("01.Verify the functionality of logging into IDNE application", "pass", false);
//			
			// Verify Page displayed
			verifyPageTitle(eValue);
		


	}

	

	

	}
