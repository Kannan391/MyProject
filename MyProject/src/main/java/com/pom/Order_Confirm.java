package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confirm {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submi;
	
	@FindBy(xpath = "//li[@class=\"step_done second\"]")
	private WebElement back;

	public Order_Confirm(WebDriver driver1) {
     this.driver = driver1;
     PageFactory.initElements(driver, this);
	}

	public WebElement getSubmi() {
		return submi;
	}
	public WebElement getBack() {
		return back;
	}

}
