package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement Itinerary;
	
	@FindBy(id = "username_show")
	private WebElement Usernameshow;
	
	public Booking_Confirmation(WebDriver driver1) {
	      this.driver = driver1;
	      PageFactory.initElements(driver, this);
		}
	public WebElement getItinerary() {
		return Itinerary;
	}

	public WebElement getUsernameshow() {
		return Usernameshow;
	}
}
