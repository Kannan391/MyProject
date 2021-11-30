package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "passwd")
	private WebElement pass;
	@FindBy(id = "SubmitLogin")
	private WebElement sublg;
	
	
	public Login_Page(WebDriver driver1) {
      this.driver = driver1;
      PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSublg() {
		return sublg;
	}
	
	

}
