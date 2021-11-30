package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Account_Page;
import com.pom.Address_Page;
import com.pom.Addto_Cart;
import com.pom.Check_Out;
import com.pom.Login_Page;
import com.pom.Order_Confirm;
import com.pom.Order_Pgae;
import com.pom.Payment_Page;
import com.pom.Shipping_Page;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private Account_Page ap;
	private Address_Page adp;
	private Addto_Cart ac;
	private Check_Out co;
	private Login_Page lp;
	private Order_Confirm oc;
	private Order_Pgae op;
	private Payment_Page pp;
	private Shipping_Page sp;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
	}
	public Account_Page getInstanceAp() {
		if (ap == null) {
		ap = new Account_Page(driver);
		}
		
		return ap;
		}
	public Address_Page getInstanceAdp() {
		if (adp == null) {
		adp = new Address_Page(driver);
		}
		
		return adp;
		}
	
	public Addto_Cart getInstanceAc() {
		if (ac == null) {
		ac = new Addto_Cart(driver);
		}
		
		return ac;
		}
	
	public Check_Out getInstanceCo() {
		if (co == null) {
		co = new Check_Out(driver);
		}
		
		return co;
		}
	
	public Login_Page getInstanceLp() {
		if (lp == null) {
		lp = new Login_Page(driver);
		}
		
		return lp;
		}
	
	public Order_Confirm getInstanceOc() {
		if (oc == null) {
		oc = new Order_Confirm(driver);
		}
		
		return oc;
		}
	
	public Order_Pgae getInstanceOp() {
		if (op == null) {
		op = new Order_Pgae(driver);
		}
		
		return op;
		}
	
	public Payment_Page getInstancePp() {
		if (pp == null) {
		pp = new Payment_Page(driver);
		}
		
		return pp;
		}
	
	public Shipping_Page getInstanceSp() {
		if (sp == null) {
		sp = new Shipping_Page(driver);
		}
		
		return sp;
		}
	
   
}
