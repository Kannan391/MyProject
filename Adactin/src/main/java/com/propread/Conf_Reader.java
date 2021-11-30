package com.propread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Conf_Reader {
	
	public static Properties p;
	
	public Conf_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\HariAmmu\\eclipse-workspace\\Adactin\\src\\main\\java\\adactin.properties");
	    FileInputStream fis = new FileInputStream(f);
	    p = new Properties();
	    p.load(fis);   
	}
	public String getURL() throws Throwable {
    String url = p.getProperty("url");
    return url;
	}
	public String getUsername() {
		String username = p.getProperty("username");
	    return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
	    return password;
	}
	
	public String getCheckin() {
    String checkin = p.getProperty("checkin");
    return checkin;
	}
	
	public String getCheckout() {
	    String checkout = p.getProperty("checkout");
	    return checkout;
	}
	
	public String getCardno() {
    String cardno = p.getProperty("cardno");
    return cardno;
	}
	
	public String getFirtname() {
     String firstname = p.getProperty("firstname");
     return firstname;
	}
	public String getLastname() {
	     String lastname = p.getProperty("lastname");
	     return lastname;
		}
	
	public String getAddress() {
    String address = p.getProperty("address");
    return address;
	}
	
	public String getCvv() {
    String cvv = p.getProperty("cvv");
    return cvv;
	}
}

