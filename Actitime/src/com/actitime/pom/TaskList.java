package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
@FindBy(xpath="//div[.='Add New']")
private WebElement addnewbtn;
@FindBy(xpath="//div[.='+ New Customer']")
private WebElement newcustomer;
@FindBy(xpath = "(//input[@type='text' and @placeholder='Enter Customer Name' ])[2]")
private WebElement customernametbx;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement customerdescription;
@FindBy(xpath="//div[@class='emptySelection']")
private WebElement selectcustomerdd;
@FindBy (xpath="//div[@class='itemRow cpItemRow ' and .='Our company' ]")
private WebElement ourcompany;
@FindBy (xpath="//div[.='Create Customer']")
private WebElement createcustomerbtn;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
private WebElement actualcustomer;

public WebElement getActualcustomer() {
	return actualcustomer;
}

public TaskList(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddnewbtn() {
	return addnewbtn;
}

public WebElement getNewcustomer() {
	return newcustomer;
}

public WebElement getCustomernametbx() {
	return customernametbx;
}

public WebElement getCustomerdescription() {
	return customerdescription;
}

public WebElement getSelectcustomerdd() {
	return selectcustomerdd;
}

public WebElement getOurcompany() {
	return ourcompany;
}

public WebElement getCreatecustomerbtn() {
	return createcustomerbtn;
}

}
