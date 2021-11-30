package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement sub;

	public Address_Page(WebDriver driver1) {
		 this.driver = driver1;
		 PageFactory.initElements(driver, this);
	}

	public WebElement getSub() {
		return sub;
	}
	
	

}
