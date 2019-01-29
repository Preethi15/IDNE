package com.volvo.mfg.test;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;

import com.volvo.mfg.commonutilis.CommonWrapperMethods;
import com.volvo.mfg.pagecomponents.LoginPages;
import com.volvo.mfg.pagecomponents.SearchEquipmentPage;
	

public class TestIDNELoginPage extends TestBase {
	
	LoginPages loginPages;	
	SearchEquipmentPage searchEquipment;

	CommonWrapperMethods commonWrapperMethods;

	
	 @Test(dataProvider="TestDataProvider")
	 
	 public void IdneLogin(LinkedHashMap<String,String>testData) throws IOException, InterruptedException
	 {	 
		   loginPages=new LoginPages(driver);
		 
		
		 
		 loginPages.LogintoIDNE(testData.get("UserName"),testData.get("Password"),testData.get("Expected"));
		
		 System.out.println("IDNE launched Successfully");
		 
		  
	      }

	

	 
	 
}