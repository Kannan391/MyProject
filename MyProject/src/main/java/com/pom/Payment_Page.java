package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Pay by check.']")
	private WebElement check;

	public Payment_Page(WebDriver driver1) {
     this.driver = driver1;
     PageFactory.initElements(driver, this);
	}

	public WebElement getCheck() {
		return check;
	}
	
	
	

}
