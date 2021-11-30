package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	
	public WebDriver driver;
	
	@FindBy(id = "cgv")
	private WebElement cgv;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement subm;

	public Shipping_Page(WebDriver driver1) {
	 this.driver = driver1;
	 PageFactory.initElements(driver, this);
	}

	public WebElement getCgv() {
		return cgv;
	}

	public WebElement getSubm() {
		return subm;
	}
	
	

}
