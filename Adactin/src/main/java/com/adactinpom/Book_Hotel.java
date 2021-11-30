package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement FirstName;
	
	@FindBy(id = "last_name")
	private WebElement LastName;
	
	@FindBy(id = "address")
	private WebElement Address;
	
	@FindBy(id = "cc_num")
	private WebElement CardNo;
	
	@FindBy(id = "cc_type")
	private WebElement CardType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement Month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement Year;
	
	@FindBy(id= "cc_cvv")
	private WebElement Cvv;
	
	@FindBy(id = "book_now")
	private WebElement Book;
	
	
public Book_Hotel(WebDriver driver1) {
    this.driver = driver1;
    PageFactory.initElements(driver, this);
	}

public WebElement getFirstName() {
	return FirstName;
}

public WebElement getLastName() {
	return LastName;
}

public WebElement getAddress() {
	return Address;
}

public WebElement getCardNo() {
	return CardNo;
}

public WebElement getCardType() {
	return CardType;
}

public WebElement getMonth() {
	return Month;
}

public WebElement getYear() {
	return Year;
}

public WebElement getCvv() {
	return Cvv;
}

public WebElement getBook() {
	return Book;
}
	
}