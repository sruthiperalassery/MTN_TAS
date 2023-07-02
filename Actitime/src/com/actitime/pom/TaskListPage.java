package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addnew;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newcustomer;
@FindBy(xpath="(//input[@type='text'  and @placeholder='Enter Customer Name'])[2]")
private WebElement customer_name_field;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement customer_description;
@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
private WebElement drop_down;

//@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow']")
//@FindBy(xpath="(//div[text()='Our company'])[11]")
@FindBy(xpath="//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[3]/div[2]/span/div/div[2]/div/div[1]/div/div[4]")
private WebElement our_company;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createcustomer;
public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement  getaddNew() {
	 return addnew;
}
public WebElement getnewCustomer()
{
	 return newcustomer;
}
public WebElement getcustomername()
{ return customer_name_field;
	
}
public WebElement getcustomerdescription()
{ return customer_description;
	
}
public WebElement getdropDown()
{
	 return drop_down;
	
}
public WebElement getourCompany()
{   
	return our_company;
}
public WebElement getcreateCustomer()
{
	return createcustomer;
}

}

	
	
	
	
	
	
	
	
	
	
	
	


