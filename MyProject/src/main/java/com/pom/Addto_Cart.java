package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addto_Cart {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//span[@itemprop='price'])[2]")
	private WebElement tshirts;
	
	@FindBy(xpath = "//img[@width='250']")
	private WebElement img;
	
	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement cart;
	

	public Addto_Cart(WebDriver driver1) {
		this.driver = driver1;
	    PageFactory.initElements(driver, this);
	}

	public WebElement getTshirts() {
		return tshirts;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getCart() {
		return cart;
	}
	

}
