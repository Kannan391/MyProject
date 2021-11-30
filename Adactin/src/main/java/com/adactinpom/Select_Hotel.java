package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement RadioButton;
	@FindBy(id = "continue")
	private WebElement Continue;
	
	public Select_Hotel(WebDriver driver1) {
	      this.driver = driver1;
	      PageFactory.initElements(driver, this);
		}
	
	public WebElement getRadioButton() {
		return RadioButton;
	}
	
	public WebElement getContinue() {
		return Continue;
	}

}
