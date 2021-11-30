package com.MyProject;

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

import com.helper.File_Reader_Manager;
import com.pom.Account_Page;
import com.pom.Address_Page;
import com.pom.Addto_Cart;
import com.pom.Check_Out;
import com.pom.Login_Page;
import com.pom.Order_Confirm;
import com.pom.Order_Pgae;
import com.pom.Payment_Page;
import com.pom.Shipping_Page;
import com.sdp.Page_Object_Manager;

public class Test_Class extends BaseClass {
	
	public static WebDriver driver1 = BaseClass.getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
		
	public static void main(String[] args) throws Throwable {
        
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getUrl(url);
		maxi();
		moveToElement(pom.getInstanceAp().getWomen());
		click(pom.getInstanceAp().getTshirts());
		moveToElement(pom.getInstanceAc().getTshirts());
		moveToElement(pom.getInstanceAc().getImg());
        click(pom.getInstanceAc().getCart());
        implicitwait(30);	 
        
        click(pom.getInstanceCo().getPtochk());
        click(pom.getInstanceOp().getPtocheck());
        String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();        
        sendkeys(pom.getInstanceLp().getEmail(), username);
        String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
        sendkeys(pom.getInstanceLp().getPass(), password);
        click(pom.getInstanceLp().getSublg());
        
        click(pom.getInstanceAdp().getSub());
        
        click(pom.getInstanceSp().getCgv());
        click(pom.getInstanceSp().getSubm()); 
        
        click(pom.getInstancePp().getCheck());
        click(pom.getInstanceOc().getSubmi());
        scrollIntoView(pom.getInstanceOc().getBack());
	   
	    takeScreenshot();
		
	}			
}