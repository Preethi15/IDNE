package com.volvo.mfg.pagecomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.volvo.mfg.commonutilis.CommonWrapperMethods;

public class SearchEquipmentPage extends CommonWrapperMethods {

	private WebDriver driver;
	
	public SearchEquipmentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void hostNameSearch() {
		
		/*anyClick("Search Equipment Tab Click", By.xpath("//a[text()='Search equipment']"));
		driver.findElements(By.xpath("//input[@name='hostName']")).get(0).sendKeys("Vclas");
		String sentText=driver.findElements(By.xpath("//input[@name='hostName']")).get(0).getText();
		System.out.println("sentText:" +sentText);
		reportStep("sentText:"+sentText, "pass", true);*/
		
		anyClick("Search equipment click", By.xpath(prop.getProperty("IDNE_Search.Equipment.Button")));	
		driver.findElements(By.xpath(prop.getProperty("IDNE_Search.HostName.Textbox"))).get(0).sendKeys("Vclas");
		
}
}
