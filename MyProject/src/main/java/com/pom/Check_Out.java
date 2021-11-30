package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Out {
	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement ptochk;

	public Check_Out(WebDriver driver1) {
     this.driver = driver1;
     PageFactory.initElements(driver, this);
	}

	public WebElement getPtochk() {
		return ptochk;
	}
	
	
}
