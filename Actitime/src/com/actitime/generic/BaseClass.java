package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{   FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pw = p.getProperty("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un,pw);
	Thread.sleep(3000);

	}
	/*@AfterMethod
	public void logOut()
	{
		HomePage h=new HomePage(driver);
		h.logOut();
	}*/
}