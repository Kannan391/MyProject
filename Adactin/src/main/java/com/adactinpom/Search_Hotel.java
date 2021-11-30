package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement RoomType;
	
	@FindBy(id = "room_nos")
	private WebElement RoomNos;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement Checkin;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement Checkout;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement Adults;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement Child;
	
	@FindBy(id = "Submit")
	private WebElement Search;
	

	public Search_Hotel(WebDriver driver1) {
      this.driver = driver1;
      PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}
	
	public WebElement getHotel() {
    return hotels;
	}
	
	public WebElement getRoomType() {
		return RoomType;
	}
	
	public WebElement getRoomNos() {
		return RoomNos;
	}
	
	public WebElement getCheclin() {
     return Checkin;
	}
	 public WebElement getCheckout() {
		return Checkout;
	}
	 
	 public WebElement getAdults() {
		return Adults;
	}
	 
	 public WebElement getChildren() {
     return Child;
	}
	 
	 public WebElement getSearch() {
		return Search;
	}
		}
		

