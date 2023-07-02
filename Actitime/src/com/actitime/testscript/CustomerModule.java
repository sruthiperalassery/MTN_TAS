package com.actitime.testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListnersImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("create");
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String customer_name=wb.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
		String customer_description=wb.getSheet("CreateCustomer").getRow(1).getCell(4).getStringCellValue();
		
		
		HomePage h=new HomePage(driver);
		h.taskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getaddNew().click();
		
		Thread.sleep(2000);
		t.getnewCustomer().click();
		Thread.sleep(2000);
		t.getcustomername().sendKeys("hdfc");
		
		t.getcustomerdescription().sendKeys("banking");
		Thread.sleep(2000);
		t.getdropDown().click();
		Thread.sleep(2000);
		t.getourCompany().click();
		t.getcreateCustomer().click();
		
			}

}
