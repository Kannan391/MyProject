package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Pgae {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement Ptocheck;

	public Order_Pgae(WebDriver driver1) {
       this.driver = driver1;
       PageFactory.initElements(driver, this);
       
	}
	public WebElement getPtocheck() {
		return Ptocheck;
	}
	}
	
	


