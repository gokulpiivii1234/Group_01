package com.website.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage4 {
	
    WebDriver driver;
    
    @FindBy(xpath="/html/body/app-root/app-home-main/app-header/div[1]/div/div/nav/div/div/ul/li[3]/a")
    private WebElement Course_button;
    
    @FindBy(xpath="/html/body/app-root/app-main-page/app-header/div[1]/div/div/nav/div/div/ul/li[3]/ul/div[1]/li[4]/a")
    private WebElement Digital_Marketing_button;
    
    /*@FindBy(xpath="/html/body/app-root/app-single-page/body/header/div[1]/div[1]/div/div/button")
    private WebElement APPLY_NOW_button;
    
    @FindBy(xpath="/html/body/app-root/app-single-page/body/header/div[1]/div[2]/div/div/div/div/div[2]/form/div[1]/input")
    private WebElement Name;
    
    @FindBy(xpath="/html/body/app-root/app-single-page/body/header/div[1]/div[2]/div/div/div/div/div[2]/form/div[2]/input")
    private WebElement Email;
    
    @FindBy(xpath="/html/body/app-root/app-single-page/body/header/div[1]/div[2]/div/div/div/div/div[2]/form/div[3]/input")
    private WebElement Number;
    
    @FindBy(xpath="/html/body/app-root/app-single-page/body/header/div[1]/div[2]/div/div/div/div/div[2]/form/div[6]")
    private WebElement Register_button;
   
    /*@FindBy(id="userEmail")
    private WebElement MN;   
    
    @FindBy(id="currentAddress")
    private WebElement CA;
   
    @FindBy(id="permanentAddress")
    private WebElement PA;*/
    
   // driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
    
    //@FindBy(id="button[class='btn btn-primary']")
    //private WebElement Address;
    
   // @FindBy(className="btn btn-primary")
   // private WebElement Submit;*/
    
   
    public Loginpage4(WebDriver driver){
        this.driver = driver;
        
        PageFactory.initElements(driver, this);
    }
    public void click_Coursebutton(){
    	Course_button.click();
    }
    public void click_DigitalMarketingbutton(){
    	Digital_Marketing_button.click();
    }
    
   /* public void click_APPLY_NOW_button(){
    	APPLY_NOW_button.click();
    }
    
    public void name_Field(String Name2){
    	Name.sendKeys(Name2);
    }
    
    public void email_Field(String Email2){
    	Email.sendKeys(Email2);
    }
    
    public void number_Field (String Number2){
    	Number.sendKeys(Number2);
    }
    
    public void click_Registerbutton(){
    	Register_button.click();
    }*/
    /*public void setUserName(String strUserName){
    	Username.sendKeys(strUserName);     
    }

    public void setmobilenumber(String mobilenumber2){
       MN.sendKeys(mobilenumber2);
    }
    public void setEmailAddress(String emailaddress){
        CA.sendKeys(emailaddress);
    }
    public void setpassword(String Passwords){
        PA.sendKeys(Passwords);
    }
   // public void setaddress(){
       // Address.click();
    //}*/
	
   
   // public class submitButton  {
    
    	/*System.setProperty("webdriver.chrome.driver", "E:\\Workspace_Selenium_CSSSelectors_Xpath\\Locators\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();*/
		
		
    	//driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
    //}
    
}


