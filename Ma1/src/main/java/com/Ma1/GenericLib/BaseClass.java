package com.Ma1.GenericLib;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	public WebDriver driver;
	CommonUtil cm = new CommonUtil();
	@BeforeClass
	public void ConfigBC() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C://Dona//Eclipse_workSpace//Ma1//src//main//resources//chromedriver.exe");
		driver = new ChromeDriver();
		//Properties pro = cm.getpropertyObj();
		//String url = pro.getProperty("url");
		driver.get("https://www.google.com"); 
				
		
	}
	@BeforeMethod
	public void ConfigBM()
	{
		
	}
	@AfterClass
	public void ConfigAC()
	{
		driver.close();
	}
}
