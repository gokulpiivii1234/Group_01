
package com.website.scripts;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeTest;

	public class TestBase {
		
		 WebDriver driver;
		    public static Properties prop = null;
		    String driverPath = "E:\\Solutions\\Questionone\\geckodriver.exe";
		    public static void TestBase() {
		        try {
		        	
		            prop = new Properties();
		         
		            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"
		                    + "/config.properties");
		            prop.load(ip);
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		    @SuppressWarnings("deprecation")
			@BeforeTest
		    public void onSetup() {
		        TestBase(); 
		        String browserName = prop.getProperty("browser");

		        if (browserName.equals("chrome")) {
		        	System.setProperty("webdriver.chrome.driver", driverPath);
		            driver = new ChromeDriver();

		        }
		        else if (browserName.equals("firefox")) {
		        	
		        	System.setProperty("webdriver.gecko.driver", driverPath);
		            driver = new FirefoxDriver();
		        }
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		        driver.get(prop.getProperty("url"));
		        driver.manage().window().maximize();   
		        //driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
		    }

	}



