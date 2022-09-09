package com.website.scripts;
import java.io.IOException;
import org.testng.annotations.Test;
import com.website.constants.AutomationConstants;
import com.website.excelutilities.Excelutility;

import com.website.login.Loginpage;

import org.openqa.selenium.By;
import org.testng.Assert;




	public class TC_014 extends TestBase {
		Loginpage objLogin;
		@Test(priority=1)
	    public void verifyValidLogin() throws IOException, InterruptedException {
	    objLogin = new Loginpage(driver);
	    Thread.sleep(5000);
	    objLogin.click_Coursebutton();
	    Thread.sleep(5000);
	    objLogin.click_MEAN_FullStackbutton();
	    Thread.sleep(5000);
	    objLogin.click_APPLY_NOW_button();
	    Thread.sleep(5000);
	    String name = Excelutility.getCellData(0, 0);
	    String email = Excelutility.getCellData(0, 1);
	    String number = Excelutility.getCellData(0, 2);
	    objLogin.name_Field(name);
	    Thread.sleep(5000);
	    objLogin.email_Field(email);
	    Thread.sleep(5000);
	    objLogin.number_Field(number);
	    Thread.sleep(5000);
	    objLogin.click_Registerbutton();
	    Thread.sleep(5000);
	    driver.switchTo( ).alert( ).accept();
	    Thread.sleep(5000);
	    //objLogin.setmobilenumber(mobilenumber);
	    //objLogin.setEmailAddress(emailaddress);
	    //objLogin.setpassword(password);
	    
	    //objLogin.setaddress();
	    //objLogin.submitButton();
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	  
	    }



	}



