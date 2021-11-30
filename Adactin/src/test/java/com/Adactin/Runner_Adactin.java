package com.Adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.propread.File_Read_Manager;
import com.sdpadatin.Page_Obejct_Managersdp;

public class Runner_Adactin extends AdactinBase {
	
	public static WebDriver driver1 = AdactinBase.getBrowser("chrome");

	public static Page_Obejct_Managersdp pom = new Page_Obejct_Managersdp(driver);
	
	public static void main(String[] args) throws Throwable {
		
		String url = File_Read_Manager.getInstanceFRM().getInstanceCR().getURL();
		getUrl(url);
	
		maxi();
		String username = File_Read_Manager.getInstanceFRM().getInstanceCR().getUsername();
		sendkeys(pom.getInstancelp().getUsername(), username);
		String password = File_Read_Manager.getInstanceFRM().getInstanceCR().getPassword();
		sendkeys(pom.getInstancelp().getPassword(), password);
		click(pom.getInstancelp().getLogin());
		selectByIndex(pom.getInstancesh().getLocation(), 3);
		selectByIndex(pom.getInstancesh().getHotel(), 2);
		selectByIndex(pom.getInstancesh().getRoomType(), 2);
		selectByIndex(pom.getInstancesh().getRoomNos(), 2);
		String checkin = File_Read_Manager.getInstanceFRM().getInstanceCR().getCheckin();
		sendkeys(pom.getInstancesh().getCheclin(), checkin);		
		String checkout = File_Read_Manager.getInstanceFRM().getInstanceCR().getCheckout();
		sendkeys(pom.getInstancesh().getCheckout(), checkout);
		selectByIndex(pom.getInstancesh().getAdults(), 2);
		selectByIndex(pom.getInstancesh().getChildren(), 1);
		click(pom.getInstancesh().getSearch());
		
		click(pom.getInstanceseh().getRadioButton());
		click(pom.getInstanceseh().getContinue());
		
		String firstname = File_Read_Manager.getInstanceFRM().getInstanceCR().getFirtname();
		sendkeys(pom.getInstancebh().getFirstName(), firstname);
		String lastname = File_Read_Manager.getInstanceFRM().getInstanceCR().getLastname();
		sendkeys(pom.getInstancebh().getLastName(), lastname);
		String address = File_Read_Manager.getInstanceFRM().getInstanceCR().getAddress();
		sendkeys(pom.getInstancebh().getAddress(), address);
		String cardno = File_Read_Manager.getInstanceFRM().getInstanceCR().getCardno();
		sendkeys(pom.getInstancebh().getCardNo(), cardno);
		selectByIndex(pom.getInstancebh().getCardType(), 3);
		selectByIndex(pom.getInstancebh().getMonth(), 6);
		selectByIndex(pom.getInstancebh().getYear(), 3);
		String cvv = File_Read_Manager.getInstanceFRM().getInstanceCR().getCvv();
		sendkeys(pom.getInstancebh().getCvv(), cvv);
		click(pom.getInstancebh().getBook());
      
		implicitwait(30);
		click(pom.getInstancebc().getItinerary());

	}
}

