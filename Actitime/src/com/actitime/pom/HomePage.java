package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.BaseClass;

public class HomePage  {
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasktab;
	@FindBy(linkText = "Logout")
	private WebElement logoutlink;
	public HomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		
	}
	public void taskTab()
	{
		tasktab.click();
	}
	public void logOut()
	{
		logoutlink.click();
	}
	
}