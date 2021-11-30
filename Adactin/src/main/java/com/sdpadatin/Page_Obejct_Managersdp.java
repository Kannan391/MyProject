package com.sdpadatin;

import org.openqa.selenium.WebDriver;

import com.adactinpom.Book_Hotel;
import com.adactinpom.Booking_Confirmation;
import com.adactinpom.Login_Page;
import com.adactinpom.Search_Hotel;
import com.adactinpom.Select_Hotel;

public class Page_Obejct_Managersdp {
	
	public WebDriver driver;
	
	private Login_Page lp;
	private Search_Hotel sh;
	private Select_Hotel seh;
	private Book_Hotel bh;
	private Booking_Confirmation bc;
	
	
public Page_Obejct_Managersdp(WebDriver driver2) {
		
	this.driver = driver2;

	}


	public Login_Page getInstancelp() {
		if (lp == null) {
		lp = new Login_Page(driver);
		}
		
		return lp;
		}
	
	public Search_Hotel getInstancesh() {
		if (sh == null) {
		sh = new Search_Hotel(driver);
		}
	
		return sh;
		}
	
	public Select_Hotel getInstanceseh() {
		if (seh == null) {
		seh = new Select_Hotel(driver);
		}
		
		return seh;
		}
	public Book_Hotel getInstancebh() {
		if (bh == null) {
		bh = new Book_Hotel(driver);
		}
		
		return bh;
		}
	
	public Booking_Confirmation getInstancebc() {
		if (bc == null) {
		bc = new Booking_Confirmation(driver);
		}
		
		return bc;
		}
	
}
