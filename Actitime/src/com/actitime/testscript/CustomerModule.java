package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListnerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("CreateCustomer",true);
		HomePage h= new HomePage(driver);
		h.setTasktab();
		TaskList t=new TaskList(driver);
		t.getAddnewbtn().click();
		t.getNewcustomer().click();
		FileLib f= new FileLib();
		String customername = f.getExcelData("CreateCustomer", 1, 2);
		t.getCustomernametbx().sendKeys(customername);
		String customerdescription = f.getExcelData("CreateCustomer", 1, 3);
		t.getCustomerdescription().sendKeys(customerdescription);
		t.getSelectcustomerdd().click();
		t.getOurcompany().click();
		t.getCreatecustomerbtn().click();
		Thread.sleep(5000);
		String actualcustomer = t.getActualcustomer().getText();
		Assert.assertEquals(actualcustomer, customername);
	}
}